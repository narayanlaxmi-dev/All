import React, { useEffect, useState } from "react";
import axios from "axios";

export default function ShowCategory() {
  const [user] = useState("narayan");
  const [age] = useState(12);
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    console.log("Calling Category API.");
    axios
      .get("http://localhost:8080/show-categories")
      .then((response) => {
        console.log(response.data);
        setCategories(response.data);
      })
      .catch((error) => {
        console.error("Error fetching categories:", error);
      });
  }, []);

  return (
    <div className="border border-5 p-2">
      <p>
        User: {user}
        :-- age: {age}
      </p>

      <ul>
        {/* {categories.map((category, index) => (
          <li key={index}>{category.name}</li>
        ))} */}
        {categories.map((values) => (
          <li>{values.name}</li>
        ))}
      </ul>
    </div>
  );
}
