import React, { useEffect, useState } from "react";
import { useSelector } from "react-redux";

export default function Comp53() {
  const [record, setRecord] = useState([]);
  var answer = useSelector((state) => state.DataTransfer.category);

  useEffect(() => {
    if (answer == "") {
      var api = "https://fakestoreapi.com/products";
    } else {
      var api = "https://fakestoreapi.com/products/category/" + answer;
    }
    fetch(api)
      .then((response) => response.json())
      .then((data) => {
        console.log(data);
        setRecord(data);
      });
  }, [answer]); // conditional rendering = [answer]
  return (
    <div>
      <div className="row">
        {answer}
        {record &&
          record.map((value) => (
            <div className="col-3">
              <img src={value.image} className="img-fluid" alt="" />
              <p>{value.title}</p>
              <p>{value.category}</p>
            </div>
          ))}
      </div>
    </div>
  );
}
