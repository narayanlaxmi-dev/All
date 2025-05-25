import mongoose from "mongoose";
const Schema = mongoose.Schema;

const BlogPost = new Schema({
  name: String,
  price: Number,
  discount: String,
});
const TshirtModel = mongoose.model("tshirts", BlogPost); // collection always prural (s)
export default TshirtModel;
