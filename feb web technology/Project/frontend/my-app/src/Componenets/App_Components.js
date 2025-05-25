import React from "react";
import Header from "./header"; // Capital 'C' for a React component
import Footer from "./footer";
import Content from "./content";
import { Outlet } from "react-router";
import MyStore from "../Redux/MyStore";
import { Provider } from "react-redux";

function App() {
  return (
    <Provider store={MyStore}>
      <Header></Header>
      {/* <Content></Content> */}
      <Outlet></Outlet>
      <Footer></Footer>
    </Provider>
  );
}

export default App;
