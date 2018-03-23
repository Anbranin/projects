// This is an example of "non-blocking" code.
// The file does not wait until it's done reading
// the data before printing that the program has ended.
// The file waits until it's done reading the data
// in the file, and then prints that the program has ended.
var fs = require('fs');
//preloaded library? can read files n shit

var data = fs.readFileSync('read_this.txt');

console.log(data.toString());
console.log("Program Ended");
