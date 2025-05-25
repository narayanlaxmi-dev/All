import React from "react";
import Comp24 from "./Comp24";

export default function Comp23(props) {
  return (
    <div className="border border-5 p-5">
      product Name = {props.p2} <hr />
      <Comp24></Comp24>
    </div>
  );
}
