import React, { useContext } from "react";
import contextApi from "../contextApi";

export default function Comp24() {
  var result = useContext(contextApi);
  return <div>Comp24 {result}</div>;
}
