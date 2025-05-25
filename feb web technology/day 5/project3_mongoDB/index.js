import express from "express";
import mongoose from "mongoose";
mongoose
  .connect("mongodb://127.0.0.1:27017/cdac")
  .then(() => console.log("Connected!"));
const Schema = mongoose.Schema;
const userSchema = new Schema({
  name: String,
  rollno: Number,
});

const MyModel = mongoose.model("friends", userSchema);

var app = express();

app.use(express.json());

app.get("/friends/all", async (req, res) => {
  try {
    var result = await MyModel.find();
    res.send(result);
  } catch (error) {
    res.send("error in factching");
  }
});
app.post("/friends/add", async (req, res) => {
  console.log(req.body); // when i submit data through postman data come terminal
  try {
    const instance = new MyModel(req.body);
    await instance.save();
    res.send("record Added");
  } catch (error) {
    res.send("error in factching");
  }
});

app.listen(9002);
