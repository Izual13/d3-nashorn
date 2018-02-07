var domino = require('domino');

var window = domino.createWindow('<h1>Hello world</h1>');
var document = window.document;

var h1 = document.querySelector('h1');

aaa = h1.innerHTML;