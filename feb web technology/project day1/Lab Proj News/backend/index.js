import express from "express";
import cors from "cors";
import "./db/app-db.js";
import categoryModel from "./model/categorymodel.js";
import multer from "multer";
import articleModel from "./model/articlemodel.js";

const app = express(); // to handling http request and response
app.use(cors());
app.use(express.json());
app.use(express.static("uploads"));// to show img in react app

const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, "uploads/");
  },
  filename: function (req, file, cb) {
    cb(null, file.originalname);
  },
});

const upload = multer({ storage: storage }).single("path");

//http://localhost:9696/add-category

app.post("/add-category", async (req, res) => {
  try {
    console.log(req.body);
    var newCategory = new categoryModel(req.body);
    await newCategory.save();
    res.send("Category added successfully !!");
  } catch (error) {
    res.send("Failed to add Category !!");
  }
});
app.get("/categories", async (req, res) => {
  try {
    var categories = await categoryModel.find();
    res.send(categories);
  } catch (error) {
    res.send("Failed to get Categories");
  }
});
app.post("/add-article", (req, res) => {
  upload(req, res, async function (err) {
    if (err instanceof multer.MulterError) {
      console.log(err);
      res.send(err);
    } else if (err) {
      res.send(err);
    }

    req.body.path = req.file.originalname;
    var newArticle = new articleModel(req.body);
    await newArticle.save();
    res.send("Article added successfully");
  });
});
app.get("/articles", async (req, res) => {
  try {
    var articles = await articleModel.find();
    res.send(articles);
  } catch (error) {
    res.send("Failed to get article");
  }
});

//  http://localhost:9696/articles-by-category/6835440afc40816171c4fdf1
//http://localhost:9696/articles-by-category/683543ecfc40816171c4fdef
//localhost:9696/articles-by-category/6835440afc40816171c4fdf1

http: app.get("/articles-by-category/:categoryid", async (req, res) => {
  try {
    var catId = req.params.categoryid;
    var articles = await articleModel.find({ categoryid: catId });
    res.send(articles);
  } catch (error) {
    res.send("Failed to articles");
  }
});

app.listen(9696);
