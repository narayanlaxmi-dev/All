import React, { useEffect, useRef, useState } from "react";
import axios from "axios";

export default function Product() {
  var x1 = useRef(); // capture  text box
  var x2 = useRef(); // error print
  var x3 = useRef();
  var x4 = useRef();
  var x11 = useRef();
  var x22 = useRef();

  var [category, setCategory] = useState([]);
  var [brand, setbrand] = useState([]);
  var [file, setfile] = useState({}); // img store
  var [status, setStatus] = useState(false); // if img file not selected flase

  useEffect(() => {
    axios // this code showCategory
      .get("http://localhost:8080/show-categories")
      .then((response) => {
        console.log(response.data);
        setCategory(response.data);
      })
      .catch((error) => {
        console.error("Error fetching categories:", error);
      });
    axios //this code showBrands
      .get("http://localhost:8080/show-brands")
      .then((response) => {
        console.log(response.data);
        setbrand(response.data);
      })
      .catch((error) => {
        console.error("Error fetching brands:", error);
      });
  }, []);

  function myFunc(ev) {
    console.log(ev);
    console.log(ev.target.files[0]);
    setStatus(true);
    setfile(ev.target.files[0]);
  }
  function myfunc1(ev) {
    ev.preventDefault();
    var record = new FormData();
    if (status) {
      record.append("name", x3.current.value);
      record.append("price", x4.current.value);
      record.append("categoryid", x11.current.value);
      record.append("brandid", x22.current.value);
      record.append("path", file);

      axios
        .post("http://localhost:8080/add-product", record)
        .then((result) => {
          console.log(result);
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      alert("PLease Select The File");
    }
  }
  return (
    <div className="container" ref={x1}>
      <h1>Add Product</h1>
      <form onSubmit={myfunc1}>
        <select name="" ref={x11}>
          <option value="">Select Category</option>
          {category &&
            category.map((value) => (
              <option key={value._id} value={value._id}>
                {value.name}
              </option>
            ))}
        </select>
        <br />
        <select name="" ref={x22}>
          <option value="">Select Brand</option>
          {brand &&
            brand.map((val) => (
              <option key={val._id} value={val._id}>
                {" "}
                {val.name}
              </option>
            ))}
        </select>
        <br />
        <input type="text" placeholder="Name" ref={x3} /> <br />
        <input type="text" placeholder="Price" ref={x4} /> <br />
        <input type="file" onChange={myFunc} />
        <br />
        <button className="btn nth-dark">Add</button>
      </form>

      <p ref={x2}></p>
    </div>
  );
}
