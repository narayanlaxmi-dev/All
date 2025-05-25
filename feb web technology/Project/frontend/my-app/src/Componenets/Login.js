import React from "react";

export default function Login() {
  return (
    <div className="container">
      <h1>LogIn</h1>
      <input type="text" placeholder="Email" id="" /> <br />
      <input type="password" placeholder="Password" id="" /> <br />
      <button className="btn nth-dark">SignIn</button>
    </div>
  );
}
