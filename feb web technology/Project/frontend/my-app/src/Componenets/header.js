import React from "react";
import { useSelector } from "react-redux";
import { Link } from "react-router";

function Header() {
  var cartCount = useSelector((state) => state.cart.cart); // array length
  return (
    <div className="container">
      <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="">
            Navbar
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/state-props"
                >
                  state Props
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="">
                  Home
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/comp21">
                  Props Dilling
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/comp31">
                  State Lift
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/comp51">
                  Redux Ex1
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/comp41">
                  Error Boundary
                </Link>
              </li>
              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/add-tshirt"
                >
                  tshirt add Comp10
                </Link>
              </li>
              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/show-tshirt"
                >
                  tshirt show Comp10
                </Link>
              </li>
              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/show-users"
                >
                  Class Component2
                </Link>
              </li>
              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/show-users"
                >
                  All Users
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/login">
                  login
                </Link>
              </li>

              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/register"
                >
                  register
                </Link>
              </li>

              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/add-brand"
                >
                  add brands
                </Link>
              </li>

              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/add-category"
                >
                  add category
                </Link>
              </li>

              <li class="nav-item">
                <Link
                  class="nav-link active"
                  aria-current="page"
                  to="/add-product"
                >
                  {" "}
                  add product
                </Link>
              </li>
              <li class="nav-item">
                <Link class="nav-link active" aria-current="page" to="/card">
                  Cart({cartCount.length})
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </div>
  );
}
export default Header;
