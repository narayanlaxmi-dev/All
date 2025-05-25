import express from "express";
import cors from "cors";
import "./DataBase/db.js";
import brandModel from "./model/brandModel.js";
import categoryModel from "./model/catogeryModel.js";
import productsModel from "./model/productModel.js";
import usersModel from "./model/userModel.js";
import TshirtModel from "./model/TshirtModel.js";
import multer from "multer"; // file uploading
import payUMoney from "payumoney_nodejs";

// merchant solve key
payUMoney.setProdKeys("6PqKSK15", "sAOVPuJG2X");
payUMoney.isProdMode(true); //set false for use of sandbox mode

const storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, "uploads/");
  },
  filename: function (req, file, cb) {
    cb(null, file.originalname);
  },
});

const upload = multer({ storage: storage }).single("path"); // multiple file array() or 1 single()

var app = express();

app.use(express.json());
app.use(cors());
app.use("/uploads", express.static("uploads")); // img access to show product

app.post("/register", async (req, res) => {
  console.log(req.body);
  try {
    var instance = new usersModel(req.body);
    await instance.save();
    res.send("Registered ..");
  } catch (error) {
    res.send("Error in Adding register.");
  }
});
app.post("/login", (req, res) => {});
app.post("/add-category", async (req, res) => {
  console.log(req.body);
  try {
    var instance = new categoryModel(req.body);
    await instance.save();
    res.send("Category Added...");
  } catch (error) {
    res.send("Error in Adding Category.");
  }
});
app.post("/add-brand", async (req, res) => {
  console.log(req.body);
  try {
    var instance = new brandModel(req.body);
    await instance.save();
    res.send("Brand Added...");
  } catch (error) {
    res.send("Error in Adding Brand.");
  }
});
app.post("/add-product", (req, res) => {
  upload(req, res, async function (err) {
    if (err instanceof multer.MulterError) {
      // A Multer error occurred when uploading.
      console.log(err);
    } else if (err) {
      // An unknown error occurred when uploading.
      console.log(err);
    }

    // Everything went fine.
    console.log(req.body);
    console.log(req.file);
    req.body.path = req.file.originalname;

    try {
      var instance = new productsModel(req.body);
      await instance.save();
      res.send("Product Added...");
    } catch (error) {
      res.send("Error in Adding Product.");
    }
  });
});
app.get("/show-categories", async (req, res) => {
  try {
    var result = await categoryModel.find();
    res.send(result);
  } catch (error) {
    res.send(error);
  }
});
app.get("/show-brands", async (req, res) => {
  try {
    var result = await brandModel.find();
    res.send(result);
  } catch (error) {
    res.send(error);
  }
});

app.get("/show-users", async (req, res) => {
  try {
    var result = await usersModel.find();
    res.send(result);
  } catch (error) {
    res.send(error);
  }
});
app.get("/show-products", async (req, res) => {
  try {
    var result = await productsModel.find();
    res.send(result);
  } catch (error) {
    res.send(error);
  }
});
app.post("/checkout", (req, res) => {});

app.post("/add-tshirt", async (req, res) => {
  console.log(req.body);
  try {
    var instance = new TshirtModel(req.body);
    await instance.save();
    res.send("Tshirt Added...");
  } catch (error) {
    res.send("Error in Adding Tshirt.");
  }
});
app.get("/show-tshirt", async (req, res) => {
  try {
    var result = await TshirtModel.find();
    res.send(result);
  } catch (error) {
    res.send(error);
  }
});
app.post("/payment-action", (req, res) => {
  console.log(req.body);
  req.body.txnid = Math.round(Math.random() * 100000);
  req.body.surl = "http:localhost:8080/success";
  req.body.furl = "http:localhost:8080/failure";

  payUMoney.pay(req.body, function (error, response) {
    if (error) {
      // Some error console.log(response);
    } else {
      // You will get a link in response to redirect to payUMoney
      console.log(response);
      res.send(response);
    }
  });
});

app.post("/success", (req, res) => {
  console.log(req.body);
  res.redirect("http://localhost:3000/success");
});

app.post("/failure", (req, res) => {
  console.log(req.body);
  res.redirect("http://localhost:3000/failure");
});

app.listen(8080);
