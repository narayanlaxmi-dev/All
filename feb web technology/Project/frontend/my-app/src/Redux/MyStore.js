import { configureStore } from "@reduxjs/toolkit";
import DataTransferReducer from "./Slices/DataTransferSlice";
import cartReducer from "./Slices/CardSlices";

const MyStore = configureStore({
  reducer: {
    cart: cartReducer,
    DataTransfer: DataTransferReducer,
  },
});

export default MyStore;
