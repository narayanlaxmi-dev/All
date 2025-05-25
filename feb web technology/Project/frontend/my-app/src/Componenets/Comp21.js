import React, { useRef, useState } from "react";
import Comp22 from "./Comp22";
import contextApi from "../contextApi";

export default function () {
  var [data, setData] = useState("dummyProd");
  var x1 = useRef();
  function myFunc() {
    var product = x1.current.value;
    setData(product);
  }

  return (
    <div className="container border border-5 p-5">
      <input type="text" ref={x1} />
      <button onClick={myFunc}>Search</button>
      {data}
      <contextApi.Provider value={data}>
        <Comp22 p1={data}></Comp22>
      </contextApi.Provider>
    </div>
  );
}
