var http = require('http');
//use the require directive to load the http module and store the returned HTTP
//instance in a variable

http.createServer(function (request, response) {
  //send the HTTP header
  //HTTP Status: 200 : OK
  //Content Type: text/plain
  response.writeHead(200, {'Content-Type': 'text/plain'});

  // Send the response body as Hello World
  response.end('HELLO JAMIN\n');
}).listen(3000);
// now listening on port 3000

console.log('Server running at localhost://127.0.0.1:3000/');
// The above code is enough to create an HTTP server which listens or waits for
// a request over port 3000 on the local machine
// NOTE: You must restart the server for any changes to be assessed. (no Spring)
