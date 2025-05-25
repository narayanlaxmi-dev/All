import mongoose from "mongoose";
const Schema = mongoose.Schema;

const BlogPost = new Schema({
  name: String,
});
const brandModel = mongoose.model("brands", BlogPost);
export default brandModel;
