import React from "react";
import { useDispatch } from "react-redux";
import { SharedData } from "../Redux/Slices/DataTransferSlice";

export default function Comp32(props) {
  let dispatch = useDispatch();
  function myFunc(ev) {
    console.log(ev); // displayobject target innertxt or innerhtml
    console.log(ev.target.innerText); // display console
    props.m1(ev.target.innerText);
    // dispatch data to store redux store
    dispatch(SharedData(ev.target.innerText));
  }
  return (
    <div>
      <h1>Brand Name</h1>
      <ul>
        <li onClick={myFunc}>Nike</li>
        <li onClick={myFunc}>Anime</li>
      </ul>
    </div>
  );
}
