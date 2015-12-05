# reader-clojure-web-app [![Build Status](https://travis-ci.org/Bloomca/reader-clojure-web-app.svg?branch=master)](https://travis-ci.org/Bloomca/reader-clojure-web-app)

FB2 offline reader web app in clojure

## Installation

For front-end you need node.js ^4.0.0.
```
npm i && gulp styles
```
It will watch all *.styl* files in the future.
Autoprefixer adds prefixes to two last major browsers.

For clojurescript frontent code use
```
lein figwheel dev
```
It will spin up a server with static in localhost :3449 with hot code reload.
REPL will connect automatically after you will open link in browser
Next, you can do something like:
```
(in-ns 'read-web-app.core)
```
And then swap state, if you want.

For serverside run
```
lein ring server-headless
```

## Migrations
```
$ lein rollback

$ lein migrate
```

It will spin up backend server at :3000 with hot code reload.

## Usage

Not yet.

## License

Copyright © 2015 MIT

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
