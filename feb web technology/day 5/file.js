// synchronous Way
var fs = require("fs");
console.log("Start");
// var result = fs.readFileSync("1.html"); // buffer
var result = fs.readFileSync("1.html", "utf-8");
console.log(result);
console.log("end");
