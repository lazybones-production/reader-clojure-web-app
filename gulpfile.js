const gulp = require('gulp');
const stylus = require('gulp-stylus');
const postcss = require('gulp-postcss');
const autoprefixer = require('autoprefixer');
const sourcemaps = require('gulp-sourcemaps');
const glob = require('glob');
const fs = require('mz/fs');

const GLOB = 'src/**/*.styl';

gulp.task('styles', () => {
  glob(GLOB, (err, files) => {
    const promises = files.map(fileName => {
      return fs.readFile(fileName, 'utf8');
    });
    const intermediateFile = Promise
      .all(promises)
      .then(res => fs.writeFile('resources/out/styles.styl', res.join('\n')));

    intermediateFile.then(() => {
      gulp.src('resources/out/styles.styl')
        .pipe(sourcemaps.init())
        .pipe(stylus())
        .pipe(postcss([ autoprefixer({ browsers: ['last 2 versions'] }) ]))
        .pipe(sourcemaps.write())
        .pipe(gulp.dest('resources/public'));
    });
  });
});

var watcher = gulp.watch(GLOB, ['styles']);
watcher.on('change', function(event) {
  console.log('File ' + event.path + ' was ' + event.type + ', running tasks...');
});
