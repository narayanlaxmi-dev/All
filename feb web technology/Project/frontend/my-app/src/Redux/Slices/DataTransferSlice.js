import { createSlice } from "@reduxjs/toolkit";
import Category from "../../Componenets/Category";

const initialState = {
  brand: "Test Brand",
  category: "",
};
export const dataTransferSlice = createSlice({
  // slice = shopkeper
  name: "dataTransfer",
  initialState,
  reducers: {
    SharedData: (state, action) => {
      console.log("Shared Data Called.", action); // object  payload: "Nike"  console display
      state.brand = action.payload;
    },
    ShareCategoryData: (state, action) => {
      console.log("Shared Category Data Called.", action);
      state.category = action.payload;
    },
  },
});

// Action creators are generated for each case reducer function
export const { SharedData, ShareCategoryData } = dataTransferSlice.actions;

export default dataTransferSlice.reducer;
