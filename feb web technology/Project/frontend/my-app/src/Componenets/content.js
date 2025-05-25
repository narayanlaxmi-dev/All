import React from "react";
import ShowBrand from "./ShowBrand";
import ShowCatogery from "./ShowCatogery";
import ShowProduct from "./ShowProduct";

export default function content() {
  return (
    <div className="container">
      <div className="row">
        <div className="col-3">
          <section>
            <h2>Categories</h2>
            <ShowCatogery></ShowCatogery>
          </section>

          <section>
            <h2>Brands</h2>
            <ShowBrand></ShowBrand>
          </section>
        </div>
        <div className="col-9">
          <section>
            <h2>Products</h2>
            <ShowProduct></ShowProduct>
          </section>
        </div>
      </div>
      <p></p>
    </div>
  );
}
