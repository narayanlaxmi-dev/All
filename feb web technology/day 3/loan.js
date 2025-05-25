// Event handler for button click
document.querySelector("button").onclick = function () {
  // Fetch values from input fields
  var amount = document.getElementById("amt").value;
  var roi = document.getElementById("roi").value;
  var y = document.getElementById("y").value;

  console.log(amount, roi, y);

  // Validation
  if (amount === "" || roi === "" || y === "") {
    document.querySelector("p").innerText = "All Values are Required";
    document.querySelector("p").className = "alert alert-danger";
  } else if (isNaN(amount) || isNaN(roi) || isNaN(y)) {
    document.querySelector("p").innerText = "All Values must be a Number";
    document.querySelector("p").className = "alert alert-danger";
  } else {
    // Convert input values to numbers
    var p = parseFloat(amount);
    var r = parseFloat(roi) / 100 / 12; // convert annual rate to monthly decimal
    var n = parseInt(y) * 12; // years to months

    // Calculate EMI using standard formula
    var emi = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
    emi = Math.round(emi);

    var total_paid = Math.round(emi * n);
    var total_interest = total_paid - p;

    // Display results
    document.querySelector("p").innerHTML = `
        EMI = ₹${emi} <br>
        Loan Amount = ₹${p} <br>
        Total Paid = ₹${total_paid} <br>
        Total Interest = ₹${total_interest} <br>
      `;
    document.querySelector("p").className = "alert alert-success";

    // Chart animation extension
    (function (H) {
      H.seriesTypes.pie.prototype.animate = function (init) {
        const series = this,
          chart = series.chart,
          points = series.points,
          { animation } = series.options,
          { startAngleRad } = series;

        function fanAnimate(point, startAngleRad) {
          const graphic = point.graphic,
            args = point.shapeArgs;

          if (graphic && args) {
            graphic
              .attr({
                start: startAngleRad,
                end: startAngleRad,
                opacity: 1,
              })
              .animate(
                {
                  start: args.start,
                  end: args.end,
                },
                {
                  duration: animation.duration / points.length,
                },
                function () {
                  if (points[point.index + 1]) {
                    fanAnimate(points[point.index + 1], args.end);
                  }
                  if (point.index === series.points.length - 1) {
                    series.dataLabelsGroup.animate(
                      { opacity: 1 },
                      void 0,
                      function () {
                        points.forEach((point) => {
                          point.opacity = 1;
                        });
                        series.update(
                          {
                            enableMouseTracking: true,
                          },
                          false
                        );
                        chart.update({
                          plotOptions: {
                            pie: {
                              innerSize: "40%",
                              borderRadius: 8,
                            },
                          },
                        });
                      }
                    );
                  }
                }
              );
          }
        }

        if (init) {
          points.forEach((point) => {
            point.opacity = 0;
          });
        } else {
          fanAnimate(points[0], startAngleRad);
        }
      };
    })(Highcharts);

    // Draw the chart
    Highcharts.chart("container", {
      chart: {
        type: "pie",
      },
      title: {
        text: "Loan Breakdown",
      },
      subtitle: {
        text: "Custom animation of loan chart",
      },
      tooltip: {
        headerFormat: "",
        pointFormat:
          '<span style="color:{point.color}">\u25cf</span> {point.name}: <b>{point.percentage:.1f}%</b>',
      },
      accessibility: {
        point: {
          valueSuffix: "%",
        },
      },
      plotOptions: {
        pie: {
          allowPointSelect: true,
          borderWidth: 2,
          cursor: "pointer",
          dataLabels: {
            enabled: true,
            format: "<b>{point.name}</b><br>{point.percentage:.1f}%",
            distance: 20,
          },
        },
      },
      series: [
        {
          enableMouseTracking: false,
          animation: {
            duration: 2000,
          },
          colorByPoint: true,
          data: [
            {
              name: "Loan Amount",
              y: p,
            },
            {
              name: "Total Interest",
              sliced: true,
              selected: true,
              y: total_interest,
            },
          ],
        },
      ],
    });
  }
};
