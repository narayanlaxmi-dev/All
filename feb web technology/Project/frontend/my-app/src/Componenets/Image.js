import React from "react";

export default function Image(props) {
  if (props.path == "") {
    throw new Error("Image Path Not Found.  ");
  }
  return (
    <div>
      <img src={props.path} className="img-fluid" alt="Images" />
    </div>
  );
}
