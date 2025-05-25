import React from "react";
import Image from "./Image";
import ErrorBoundary from "../ErrorBoundary";

export default function Comp41() {
  return (
    <div className="container">
      <h1> Error Boundary</h1>
      <div className="row">
        <div className="col-4">
          <ErrorBoundary>
            <Image path="https://t4.ftcdn.net/jpg/02/68/06/03/240_F_268060371_nFgoQQSnlBxODiV4pDpfq5vqXeavzisd.jpg"></Image>
          </ErrorBoundary>
        </div>
        <div className="col-4">
          <ErrorBoundary>
            <Image path="https://t3.ftcdn.net/jpg/03/72/21/90/240_F_372219097_PeHtGalfSoo32xoPiQx7OmzU1arxmQ52.jpg"></Image>
          </ErrorBoundary>
        </div>
        <div className="col-4">
          <ErrorBoundary>
            <Image path=""></Image>
          </ErrorBoundary>
        </div>
      </div>
    </div>
  );
}
