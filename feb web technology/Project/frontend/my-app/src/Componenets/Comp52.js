import React, { useEffect, useState } from "react";
import axios from "axios";
import { useDispatch } from "react-redux";
import { ShareCategoryData } from "../Redux/Slices/DataTransferSlice";

export default function Comp52() {
  const [record, setRecord] = useState([]);
  let dispatch = useDispatch(ShareCategoryData);

  useEffect(() => {
    axios
      .get("https://fakestoreapi.com/products/categories")
      .then((result) => {
        console.log(result);
        setRecord(result.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  function myFunc(ev) {
    console.log(ev); // displayobject target innertxt or innerhtml
    console.log(ev.target.innerText); // display console
    dispatch(ShareCategoryData(ev.target.innerText));
  }
  return (
    <div>
      <ul>
        {record.map((val) => (
          <li onClick={myFunc}>{val}</li>
        ))}
      </ul>
    </div>
  );
}
