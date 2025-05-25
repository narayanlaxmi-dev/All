import React, { useState } from "react";
import Comp32 from "./Comp32";
import Comp33 from "./Comp33";

export default function Comp31() {
  var [brand, setBrand] = useState("ONE PIECE");

  function Comp31Func(value) {
    console.log("Function called, data lifted:", value);
    setBrand(value);
  }
  return (
    <div>
      <h1 className="container">State Lift</h1>
      <div className="row">
        <div className="col-3 border border-5 p-5">
          <Comp32 m1={Comp31Func}></Comp32>
        </div>
        <div className="col-9 border border-5 p-5">
          <Comp33 p1={brand}></Comp33>
        </div>
      </div>
    </div>
  );
}
