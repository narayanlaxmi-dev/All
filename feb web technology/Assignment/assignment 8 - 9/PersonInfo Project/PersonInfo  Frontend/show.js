$(document).ready(function () {
  $("button").click(function () {
    $.ajax({
      type: "GET",
      url: "http://localhost:9090/persons/all",
      success: function (result) {
        $("tbody").empty(); // Clear existing rows
        result.forEach(function (value) {
          $("tbody").append(`
            <tr>
              <td>${value.name}</td>
              <td>${value.age}</td>
              <td>${value.address}</td>
            </tr>
          `);
        });
      },
      error: function (xhr, status, error) {
        console.error("Error fetching data:", error);
      },
    });
  });
});
