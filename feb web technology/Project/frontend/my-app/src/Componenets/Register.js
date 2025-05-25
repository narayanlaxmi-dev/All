import React, { useRef } from "react";
import axios from "axios";

export default function Register() {
  var x1 = useRef();
  var x2 = useRef();
  var x3 = useRef();
  var x4 = useRef();
  var x5 = useRef(); // for error
  function myFunc() {
    if (x3.current.value != x4.current.value) {
      x5.current.innerHTML = "PASSWORD NOT MATCHING  / MISSMATCH.";
      x5.current.className = "alert alert-danger";
    } else {
      var record = {
        name: x1.current.value,
        email: x2.current.value,
        password: x3.current.value,
      };
      console.log(record);
      axios
        .post("http://localhost:8080/Register", record)
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
      <h1>Register</h1>
      <input type="text" placeholder="Name" id="" ref={x1} /> <br />
      <input type="text" placeholder="email" id="" ref={x2} /> <br />
      <input type="password" placeholder="Password" id="" ref={x3} /> <br />
      <input
        type="password"
        placeholder="confirm password"
        id=""
        ref={x4}
      />{" "}
      <br />
      <button className="btn nth-dark" onClick={myFunc}>
        SignUp
      </button>
      <p ref={x5}> </p>
    </div>
  );
}
