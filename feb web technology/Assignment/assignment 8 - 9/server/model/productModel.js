import mongoose from "mongoose";

const product = new mongoose.Schema({
  name: String,
  price: Number,
  category: String,
  desc:String
});

export const productModel = mongoose.model("products", product);
