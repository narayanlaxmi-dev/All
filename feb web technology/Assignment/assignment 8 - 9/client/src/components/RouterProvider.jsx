import { BrowserRouter, Routes, Route } from "react-router";
import App from "../App";
import Products from "./Product";
import AddProduct from "./AddProduct";
import UpdateProduct from "./UpdateProduct";
import DeleteProduct from "./DeleteProduct";

const RouterProvider = () => {
  return (
    <BrowserRouter>
    <Routes>
        <Route path="/" element={<App />}>
         <Route path="" element={<Products />}/>
         <Route path="/add" element={<AddProduct />}/>
         <Route path="/update/:id" element={<UpdateProduct />}/>
         <Route path="/delete" element={<DeleteProduct />}/>

        </Route>
    </Routes>
    </BrowserRouter>
  )
}

export default RouterProvider