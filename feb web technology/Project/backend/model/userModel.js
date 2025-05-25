import mongoose from "mongoose";
const Schema = mongoose.Schema;

const BlogPost = new Schema({
  name: String,
  email: String,
  password: String,
});
const usersModel = mongoose.model("users", BlogPost);
export default usersModel;
