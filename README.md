# reader-clojure-web-app [![Build Status](https://travis-ci.org/Bloomca/reader-clojure-web-app.svg?branch=master)](https://travis-ci.org/Bloomca/reader-clojure-web-app)

FB2 catalog and reader web app in clojure

## Concept

Unfortunately, we didn't implement all features.
Generally, it should be looking next way:

![Catalog](https://slack-files.com/files-tmb/T0FG97U1M-F0G1E4RHR-d06de2a804/pasted_image_at_2015_12_07_01_51_1024.png)

---
![Card](https://slack-files.com/files-tmb/T0FG97U1M-F0G1GHR97-7a8cf52b74/pasted_image_at_2015_12_07_01_52_1024.png)

---
![Landing](https://slack-files.com/files-tmb/T0FG97U1M-F0G1D2K1T-2d6ad4a582/pasted_image_at_2015_12_07_01_54_1024.png)

Actually, you could [try it yourself](http://jsfiddle.net/fkuril/xq8v8wo3/56/embedded/result/)

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
