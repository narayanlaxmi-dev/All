import mongoose from "mongoose";
const Schema = mongoose.Schema;

const BlogPost = new Schema({
  name: String,
  rollno: Number,
});
const MyModel = mongoose.model("friends", BlogPost);
export default MyModel;
