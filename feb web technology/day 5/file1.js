// Asynchronous
var fs = require("fs");
console.log("start");
fs.readFile("1.html", "utf-8", function (err, data) {
  if (err) {
    console.log(err);
  } else {
    console.log(data);
  }
});
console.log("end");
