import React, { useState } from "react";

export default function Comp1(propsVar) {
  var [place, changePlace] = useState("Nashik");
  function myFunc() {
    changePlace("PUNE");
  }

  function myFunc1() {
    changePlace("Gujarat");
  }

  function myFunc2() {
    this.props.name = "ONEPIECE";
  }

  return (
    <div className="container">
      <h1>State Vs Props (Properties)</h1>
      <p>{place}</p>
      <button onClick={myFunc}>Change</button>
      <br />
      <button onClick={myFunc1}>Change</button>
      <p>{propsVar.name}</p>
      <p>{propsVar.person}</p>
      <button onClick={myFunc2}>Change</button>
    </div>
  );
}
