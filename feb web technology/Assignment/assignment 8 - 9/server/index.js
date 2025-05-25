import express from "express";
import "./database/db.js";
import { productModel } from "./model/productModel.js";
import cors from "cors"

const app = express();
app.use(express.json());
app.use(cors())

app.get("/health", (req,res) => res.send("Server is running"))

app.post("/product", async (req, res) => {
  try {
    await productModel.create({
      name: req.body.name,
      price: req.body.price,
      category: req.body.category,
      desc:req.body.desc
    });
    res.send("Product added.");
  } catch (error) {
    res.send("Error in Adding Product.");
  }
});

app.get("/product", async (req, res) => {
  try {
    const resp = await productModel.find();
    res.send(resp);
  } catch (error) {
    res.send([]);
  }
});


app.get("/product/:id", async (req, res) => {
  try {
    const id = req.params.id;
    const resp = await productModel.findById(id);
    res.send(resp);
  } catch (error) {
    res.send([]);
  }
});

app.put("/product/:id", async (req, res) => {
  try {
    const id = req.params.id;

    const product = await productModel.findById(id);

       if(!product) res.status(404).send("No product found with id");

    const resp = await productModel.findByIdAndUpdate(id, {
      name: req.body.name,
      price: req.body.price,
      category: req.body.category,
      desc:req.body.desc
    });
    res.send(resp);
  } catch (error) {
    res.send([]);
  }
});

app.delete("/product/:id", async (req, res) => {
  try {
       const id = req.params.id;

       const product = await productModel.findById(id);

       if(!product) res.status(404).send("No product found with id");

     await productModel.findByIdAndDelete(id);

    res.status(200).send("Product deleted sucessfully!");
  } catch (error) {
    res.status(400).send("Failed to delete product");
  }
});

const port = 3001;
app.listen(port, () => {
  console.log(`Server is Runining on port ${port}`);
});
