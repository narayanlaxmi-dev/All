import express from "express";
import "./dataBase/db.js";
import MyModel from "./Model/user.js";
var app = express();
app.use(express.json()); // fpr check data passon json
app.set("view engine", "ejs");
app.use(express.urlencoded({ extended: true }));

app.get("/friends/all", async (req, res) => {
  try {
    var result = await MyModel.find();
    // res.send(result);
    res.render("showData", { data: result });
  } catch (error) {
    res.send(error);
  }
});
app.post("/friends/add", async (req, res) => {
  console.log(req.body);
  try {
    var instance = new MyModel(req.body);
    await instance.save();
    res.redirect("/friends/all");
  } catch (error) {
    res.send(error);
  }
});

app.get("/addUser", (req, res) => {
  res.render("addUser");
});
app.listen(9000);
