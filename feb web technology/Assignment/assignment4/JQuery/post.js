$(document).ready(function () {
  $("button").click(function () {
    var teamName = $("#x1").val();
    var ownerName = $("#x2").val();
    var coachName = $("#x3").val();
    var record = {
      name: teamName,
      owner: ownerName,
      coach: coachName,
    };
    record = JSON.stringify(record);
    console.log(record);

    $.ajax({
      type: "post",
      data: record,
      contentType:"application/json",
      url: "http://localhost:9000/team/add",
      success: function (result) {
        console.log(result);
      },
      error: function (result) {
        console.log(result);
      },
    });
  });
});
