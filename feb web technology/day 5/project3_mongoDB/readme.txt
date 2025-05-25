// this is all code in db.js and i can import index.js
import mongoose from "mongoose";
mongoose
  .connect("mongodb://127.0.0.1:27017/cdac")
  .then(() => console.log("Connected!"));