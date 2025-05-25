import React, { useRef } from "react";
import axios from "axios";

export default function Comp10() {
  const x1 = useRef(); // name
  const x2 = useRef(); // price
  const x3 = useRef(); // discount
  const x5 = useRef(); // error msg

  function myFunc() {
    if (
      x1.current.value === "" ||
      x2.current.value === "" ||
      x3.current.value === ""
    ) {
      x5.current.innerHTML = "Please Provide All Fields...";
      x5.current.className = "alert alert-danger";
    } else {
      const record = {
        name: x1.current.value,
        price: x2.current.value,
        discount: x3.current.value,
      };
      console.log(record);
      axios
        .post("http://localhost:8080/add-tshirt", record)
        .then((result) => {
          console.log(result);
          x5.current.innerHTML = "T-shirt added successfully!";
          x5.current.className = "alert alert-success";
        })
        .catch((error) => {
          console.log(error);
          x5.current.innerHTML = "Error adding t-shirt.";
          x5.current.className = "alert alert-danger";
        });
    }
  }

  return (
    <div>
      <h1>Add T-shirt</h1>
      <input type="text" placeholder="T-shirt Name" ref={x1} /> <br />
      <input type="number" placeholder="Price" ref={x2} /> <br />
      <input type="number" placeholder="Discount(%)" ref={x3} /> <br />
      <button className="btn btn-dark" onClick={myFunc}>
        Add T-shirt Product
      </button>
      <p ref={x5}></p>
    </div>
  );
}
