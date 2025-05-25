import React from "react";
import { useSelector } from "react-redux";

// Fetch/select data from store / redux store
export default function Comp33(props) {
  var answer = useSelector((state) => state.DataTransfer.brand);
  return (
    <div>
      Brand Name = {props.p1}
      <hr />
      Data From Redux = {answer}
    </div>
  );
}
