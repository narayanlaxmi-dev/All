import express from "express";
import mysql from "mysql";
var connection = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "password",
  database: "ipl_db",
});

var app = express();
app.use(express.json()); // to get json object from postman to this machine

app.get("/team/all", (req, res) => {
  connection.query(" select * from player;", (error, data) => {
    if (error) res.send("Error NOT Tracking or Found");
    else res.send(data);
  });
});

app.post("/team/add", (req, res) => {
  console.log(req.body);
  var query = `INSERT INTO player VALUES ("${req.body.id}", "${req.body.city}", "${req.body.name}", "${req.body.specialization}", "${req.body.team_id}");`;

  connection.query(query, (error, data) => {
    if (error) {
      console.error("Insert error:", error);
      res.status(500).send("Error inserting data.");
    } else {
      res.send("Player added successfully.");
    }
  });
});

app.listen(3001);
