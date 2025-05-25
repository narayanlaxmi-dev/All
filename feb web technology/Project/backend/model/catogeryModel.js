import mongoose from "mongoose";
const Schema = mongoose.Schema;

const BlogPost = new Schema({
  name: String,
});
const categoryModel = mongoose.model("categories", BlogPost);
export default categoryModel;
