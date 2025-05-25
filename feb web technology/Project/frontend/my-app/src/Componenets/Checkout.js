import axios from "axios";
import React, { useRef } from "react";
import { useSelector } from "react-redux";

export default function Checkout() {
  const answer = useSelector((state) => state.cart.cart);

  // Calculate the total price
  const totalPrice = answer?.reduce((acc, item) => acc + item.price, 0) || 0;
  var x1 = useRef(); // f name
  var x2 = useRef(); // l name
  var x3 = useRef(); // email
  var x4 = useRef(); // phone no
  var x5 = useRef(); //  amount
  var x6 = useRef(); // produ info
  function myfunc() {
    var record = {
      firstname: x1.current.value,
      lastname: x2.current.value,
      email: x4.current.value,
      phone: x4.current.value,
      amount: x5.current.value,
      productinfo: x6.current.value,
    };
    axios
      .post("http://localhost:8080/payment-action", record)
      .then((result) => {
        console.log(result);
        window.location.href = result.data;
      })
      .catch((error) => console.log(error));
  }

  return (
    <div className="container">
      <h1>Checkout</h1>
      <table className="table">
        <thead>
          <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Price</th>
            <th>Total Price</th>
          </tr>
        </thead>
        <tbody>
          {answer?.length > 0 ? (
            answer.map((value) => (
              <tr>
                <td>
                  <img
                    // http://localhost:8080/uploads/${value.path}
                    src={`http://localhost:8080/uploads/+{value.path}`}
                    alt="Product img"
                    className="img-fluid"
                    width="100px"
                  />
                </td>
                <td>{value.name}</td>
                <td>{value.price}</td>
                <td>{value.price}</td>
              </tr>
            ))
          ) : (
            <tr>
              <td colSpan="4">Your cart is empty</td>
            </tr>
          )}
          {answer?.length > 0 && (
            <tr>
              <td colSpan="3">Total Price</td>
              <td>{totalPrice}</td>
            </tr>
          )}
        </tbody>
      </table>
      <h2>CheckOut Form</h2>
      <input
        type="text"
        placeholder="Firstname"
        className="form-control"
        ref={x1}
      />
      <br />
      <input
        type="text"
        placeholder="LastName"
        className="form-control"
        ref={x2}
      />
      <br />
      <input
        type="text"
        placeholder="email"
        className="form-control"
        ref={x3}
      />{" "}
      <br />
      <input
        type="text"
        placeholder="phone no"
        className="form-control"
        ref={x4}
      />
      <br />
      <input
        type="text"
        placeholder="Amount"
        className="form-control"
        ref={x5}
      />{" "}
      <br />
      <input
        type="text"
        placeholder="Product-info"
        className="form-control"
        ref={x6}
      />
      <br />
      <button onClick={myfunc}>PAY</button>
    </div>
  );
}
