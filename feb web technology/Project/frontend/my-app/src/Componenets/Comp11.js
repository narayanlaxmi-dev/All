import React, { useEffect, useState } from "react";
import axios from "axios";

export default function Comp11() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/show-tshirt")
      .then((res) => {
        setData(res.data);
      })
      .catch((err) => {
        console.error(err);
      });
  }, []);

  return (
    <div className="container mt-4">
      <h1 className="mb-4">T-Shirt List with Discount</h1>
      <table className="table table-bordered table-striped">
        <thead>
          <tr>
            <th>Name</th>
            <th>Original Price</th>
            <th>Discount (%)</th>
            <th>Final Price</th>
          </tr>
        </thead>
        <tbody>
          {data.map((val) => {
            const price = val.price;
            const discount = val.discount || 0;
            const finalPrice = price - (price * discount) / 100;

            return (
              <tr key={val.id || val.name}>
                <td>{val.name}</td>
                <td>₹{price}</td>
                <td>{discount}%</td>
                <td>₹{finalPrice}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}
