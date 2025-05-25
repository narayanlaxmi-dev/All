import React from "react";
import Comp23 from "./Comp23";

export default function Comp22(props) {
  return (
    <div>
      <div className="row">
        <div className="col-3">
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate.
        </div>
        <div className="col-9 border border-5 p-5">
          {props.p1}
          <h1>Products </h1>
          <Comp23 p2={props.p1}></Comp23>
        </div>
      </div>
    </div>
  );
}
