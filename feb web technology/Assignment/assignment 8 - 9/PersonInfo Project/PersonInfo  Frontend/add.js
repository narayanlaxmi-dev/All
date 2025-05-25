$(document).ready(function () {
  $("button").click(function () {
    var Name = $("#x1").val();
    var Age = $("#x2").val();
    var Address = $("#x3").val();

    var record = {
      name: Name,
      age: Age,
      address: Address,
    };
    record = JSON.stringify(record);
    console.log(record);

    $.ajax({
      type: "POST",
      data: record,
      contentType: "application/json",
      url: "http://localhost:9090/persons/add",
      success: function (result) {
        console.log(result);
      },
      error: function (result) {
        console.log(result);
      },
    });
  });
});
