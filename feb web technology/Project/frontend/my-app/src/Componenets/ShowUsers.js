import React, { useEffect, useState } from "react";
import axios from "axios";

export default function ShowUsers() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    console.log("Calling Brand API.");
    axios
      .get("http://localhost:8080/show-users")
      .then((response) => {
        console.log(response.data);
        setUsers(response.data);
      })
      .catch((error) => {
        console.error("Error fetching brands:", error);
      });
  }, []);

  return (
    // <div>
    //   <ul>
    //     {/* {users.map((values) => (
    //       <li> {values.name}</li>
    //     ))} */}

    //     {users.map((user) => (
    //       <li key={user.id}>{user.name}</li>
    //     ))}
    //   </ul>
    // </div>
    <table
      border="1"
      cellPadding="8"
      style={{ borderCollapse: "collapse", width: "100%" }}
    >
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Role</th>
        </tr>
      </thead>
      <tbody>
        {users.map((user) => (
          <tr key={user.id}>
            <td>{user.id}</td>
            <td>{user.name}</td>
            <td>{user.email}</td>
            <td>{user.password}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}
