import mongoose from "mongoose";

mongoose
  .connect("mongodb://127.0.0.1:27017/server")
  .then(() => console.log("db connection success"))
  .catch((err) => console.log(err));
