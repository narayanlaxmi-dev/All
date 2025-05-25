import React, { useEffect, useState } from "react";
import axios from "axios";

export default function ShowBrand() {
  const [brands, setBrands] = useState([]);

  useEffect(() => {
    console.log("Calling Brand API.");
    axios
      .get("http://localhost:8080/show-brands")
      .then((response) => {
        console.log(response.data);
        setBrands(response.data);
      })
      .catch((error) => {
        console.error("Error fetching brands:", error);
      });
  }, []);

  return (
    <div className="border border-5 p-2">
      <ul>
        {brands.map((brand, index) => (
          <li key={index}>{brand.name}</li>
        ))}
      </ul>
    </div>
  );
}
