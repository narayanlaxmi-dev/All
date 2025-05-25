var http = require("http");
var fs = require("fs");

var server = http.createServer(function (req, res) {
  fs.readFile("1.html", "utf-8", function (error, data) {
    if (!error) res.end(data);
  });
});

server.listen(9000); // localhost:9001
