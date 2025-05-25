document.querySelector("button").addEventListener("click", function () {
  var unit1 = document.getElementById("x1").value;
  var price1 = document.getElementById("x2").value;
  var unit2 = document.getElementById("x3").value;
  var price2 = document.getElementById("x4").value;
  //
  price1 = parseInt(price1);
  unit1 = parseInt(unit1);
  unit2 = parseInt(unit2);
  price2 = Number(price2);

  var Result1 = unit1 * price1;
  var Result2 = unit2 * price2;
  var quantity = unit1 + unit2;
  var totalPrice = Result1 + Result2;
  var avgPrice = totalPrice / quantity;

  // presentation
  document.querySelector("p").innerHTML = `
    Total Price = ${totalPrice} <br>
    Total Quantity = ${quantity} <br>
    Average Price = ${avgPrice} <br>
    `;
});
