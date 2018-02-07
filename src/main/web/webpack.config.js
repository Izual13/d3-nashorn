var packageJSON = require('./package.json');
var path = require('path');
var webpack = require('webpack');

const PATHS = {
    build: path.join(__dirname, "../", "resources")
};

module.exports = {
    entry: './src/index.js',

    output: {
        path: PATHS.build,
        filename: 'app-bundle.js'
    }
};