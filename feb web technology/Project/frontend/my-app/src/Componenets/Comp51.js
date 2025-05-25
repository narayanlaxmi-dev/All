import React, { useEffect } from "react";
import Comp52 from "./Comp52";
import Comp53 from "./Comp53";
import axios from "axios";

export default function Comp51() {
  
  return (
    <div className="container">
      <div className="row">
        <div className="col-3">
          <Comp52></Comp52>
        </div>
        <div className="col-9">
          <Comp53></Comp53>
        </div>
      </div>
    </div>
  );
}
