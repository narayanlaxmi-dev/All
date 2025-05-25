document.querySelector("button").addEventListener("click", function () {
  var mobile = document.getElementById("x1").value;
  var pincode = document.getElementById("x2").value;
  var panCard = document.getElementById("x3").value;

  var regPinCode = /^[1-9][0-9][0-9][0-9][0-9][0-9]$/;
  var regMobile = /^[1-9][0-9]{9}$/;
  var regPan = /^([a-zA-Z]{5})([0-9]{4})([a-zA-Z])$/;

  // validation
  if (!regMobile.test(mobile)) {
    document.querySelector("p").innerText = "Invalid Mobile Number";
    document.querySelector("p").className = "alert alert-danger";
  } else if (!regPinCode.test(pincode)) {
    document.querySelector("p").innerText = "Invalid PinCode";
    document.querySelector("p").className = "alert alert-danger";
  } else if (!regPan.test(panCard)) {
    document.querySelector("p").innerText = "Invalid PAN Card";
    document.querySelector("p").className = "alert alert-danger";
  } else {
    document.querySelector("p").innerText = "SUCCESS";
    document.querySelector("p").className = "alert alert-success";
  }
});
/*
 regular expression delimiter always written
// pincode 6 digit start non zero
/^/ start
/$/ end point 

in 1 char == []
2 char == [][]
[1-9] is 1 to 9 only value other cant except
{} stands for range
() stands for group
*/
