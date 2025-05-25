import { createSlice } from "@reduxjs/toolkit";

const initialState = {
  cart: [],
};
export const cartSlice = createSlice({
  // slice = shopkeper
  name: "cart",
  initialState,
  reducers: {
    addInCart: (state, actions) => {
      console.log(actions);
      state.cart.push(actions.payload);
    },
    RemoveFromCart: (state, actions) => {
      console.log(actions.payload);
      console.log(state.cart);
      var answer = state.cart.filter((object) => object._id != actions.payload);
      console.log(answer);
      state.cart = answer;
      
    },
  },
});

// Action creators are generated for each case reducer function
export const { addInCart, RemoveFromCart } = cartSlice.actions;

export default cartSlice.reducer;
