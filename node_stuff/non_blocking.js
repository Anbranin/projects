// This is an example of "non-blocking" code.
// The file does not wait until it's done reading
// the data before printing that the program has ended.
var fs = require('fs');

var data = fs.readFileSync('read_this.txt');
fs.readFile('read_this.txt', function(err, data) {
  if (err) return console.error(err);
  console.log(data.toString());
});
console.log("Program Ended");
// Program ended will just get fucking executed immediately.
