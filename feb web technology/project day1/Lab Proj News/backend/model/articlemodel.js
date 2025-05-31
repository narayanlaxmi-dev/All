import mongoose from "mongoose";
const Schema = mongoose.Schema;

const articleSchema = new Schema({
  title: String,
  description: String,
  source: String,
  publishedAt: Date,
  url: String,
  categoryid: String,
  path: String,
});
const articleModel=mongoose.model("articles",articleSchema);

export default articleModel;