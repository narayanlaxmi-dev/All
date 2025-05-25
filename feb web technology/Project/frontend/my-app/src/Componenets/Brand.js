import React, { useRef } from "react";
import axios from "axios";

export default function Brand() {
  var x1 = useRef(); // capture  text box
  var x2 = useRef(); // error print
  function myFunc() {
    console.log(x1);
    console.log(x1.current.value);
    console.log(x2);
    if (x1.current.value == "") {
      x2.current.innerHTML = "Please enter Brand...";
      x2.current.className = "alert alert-danger";
    } else {
      var record = { name: x1.current.value };
      console.log(record);
      axios
        .post("http://localhost:8080/add-brand", record)
        .then((result) => {
          console.log(result);
        })
        .catch((error) => {
          console.log(error);
        });
    }
  }
  return (
    <div className="container">
      <h1>Add Brands</h1>
      <input type="text" placeholder="Name" id="" ref={x1} /> <br />
      <button className="btn nth-dark" onClick={myFunc}>
        Add
      </button>
      <p ref={x2}></p>
    </div>
  );
}
