import axios from "axios";
import React, { useEffect, useState } from "react";
import { useDispatch } from "react-redux";
import { addInCart } from "../Redux/Slices/CardSlices";
import { useNavigate } from "react-router";

export default function ShowProduct() {
  const [api, setapi] = useState([]);
  // dispatch used to react app to redux store
  let dispatch = useDispatch();
  let navigate = useNavigate();

  useEffect(() => {
    axios
      .get("http://localhost:8080/show-products")
      .then((response) => {
        console.log(response.data);
        setapi(response.data);
      })
      .catch((error) => {
        console.error("Error fetching categories:", error);
      });
  }, []);

  function addtoCart(val) {
    console.log(val);
    dispatch(addInCart(val));
    navigate("/card");
  }
  return (
    <div>
      <div className="row">
        {api &&
          api.map((val) => (
            <div className="col-3 text-center">
              <img
                src={"http://localhost:8080/uploads/" + val.path}
                alt="Product image"
                className="img-fluid"
              />
              <h2>{val.price}</h2>
              <p>{val.price}</p>
              <button
                onClick={() => {
                  addtoCart(val);
                }}
              >
                Add To Card
              </button>
            </div>
          ))}
      </div>
    </div>
  );
}
