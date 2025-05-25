import mongoose from "mongoose";
const Schema = mongoose.Schema;

const BlogPost = new Schema({
  name: String,
  price: Number,
  categoryId: String,
  brandId: String,
  path: String,
});
const productsModel = mongoose.model("products", BlogPost);
export default productsModel;
