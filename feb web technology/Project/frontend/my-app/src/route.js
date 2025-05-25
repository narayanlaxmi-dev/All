import { BrowserRouter, Routes, Route } from "react-router";
import App from "./Componenets/App_Components";
import Product from "./Componenets/Product";
import Content from "./Componenets/content";
import Register from "./Componenets/Register";
import Login from "./Componenets/Login";
import Category from "./Componenets/Category";
import Brand from "./Componenets/Brand";
import Card from "./Componenets/Card";
import ShowUsers from "./Componenets/ShowUsers";
import Comp1 from "./Componenets/Comp1";
import Comp2 from "./Componenets/Comp2";
import Comp10 from "./Componenets/Comp10";
import Comp11 from "./Componenets/Comp11.js";
import Comp21 from "./Componenets/Comp21.js";
import Comp31 from "./Componenets/Comp31.js";
import Comp41 from "./Componenets/Comp41.js";
import Comp51 from "./Componenets/Comp51.js";
import Checkout from "./Componenets/Checkout.js";
import Failure from "./Componenets/Failure.js";
import Success from "./Componenets/Success.js";

// http://localhost:3000/
// http://localhost:3000/login
// http://localhost:3000/register
// http://localhost:3000/add-category
// http://localhost:3000/add-brand
// http://localhost:3000/add-product
// http://localhost:3000/card

var route = (
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />}>
        <Route path="" element={<Content />}></Route>
        <Route path="login" element={<Login />}></Route>
        <Route path="register" element={<Register />}></Route>
        <Route path="add-brand" element={<Brand />}></Route>
        <Route path="add-product" element={<Product />}></Route>
        <Route path="add-category" element={<Category />}></Route>
        <Route path="card" element={<Card />}></Route>
        <Route path="show-users" element={<ShowUsers />}></Route>
        <Route
          path="state-props"
          element={<Comp1 name="Nara" person="Psycho" />}
        ></Route>
        <Route path="class-component" element={<Comp2 />} />
        <Route path="add-tshirt" element={<Comp10 />} />
        <Route path="show-tshirt" element={<Comp11 />} />
        <Route path="comp21" element={<Comp21 />}></Route>
        <Route path="comp31" element={<Comp31 />}></Route>
        <Route path="comp41" element={<Comp41 />}></Route>
        <Route path="comp51" element={<Comp51 />}></Route>
        <Route path="checkout" element={<Checkout />}></Route>
        <Route path="success" element={<Success />} />
        <Route path="failure" element={<Failure />} />
      </Route>
    </Routes>
  </BrowserRouter>
);
export default route;
