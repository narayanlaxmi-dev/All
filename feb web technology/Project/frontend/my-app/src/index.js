import React from "react";
import ReactDOM from "react-dom/client";
import "bootstrap/dist/css/bootstrap.min.css";
import "./css/style.css";
import App from "./Componenets/App_Components";
import route from "./route";

// console.log(ReactDOM);
var result = ReactDOM.createRoot(document.getElementById("root"));
// console.log(result);
/*
result.render("HelloWrold JS");

var users = "nara";
var brand = ["puma", "hel"];
function fun() {
  return 999;
}
result.render(
  <>
    <h1>{users}</h1>
    <h1>{brand[0]}</h1>
    <h1>{fun()}</h1>
  </>
);*/
result.render(route);
