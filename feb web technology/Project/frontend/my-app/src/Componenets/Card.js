import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { RemoveFromCart } from "../Redux/Slices/CardSlices";
import { Link } from "react-router";

export default function Card() {
  let answer = useSelector((state) => state.cart.cart);
  console.log(answer);
  let dispatch = useDispatch();

  function removeData(id) {
    console.log(id);
    dispatch(RemoveFromCart(id));
  }
  return (
    <div className="container">
      <h1>Cart Page</h1>
      <div className="row">
        {answer &&
          answer.map((val) => (
            <div className="col-3 text-center">
              <img
                src={"http://localhost:8080/uploads/" + val.path}
                alt="Product image"
                className="img-fluid"
              />
              <h2>{val.price}</h2>
              <p>{val.price}</p>
              <button onClick={() => removeData(val._id)}>
                {" "}
                Remove To Card
              </button>
            </div>
          ))}
      </div>
      <Link to={"/checkout"}> CheckOut Page</Link>
    </div>
  );
}
