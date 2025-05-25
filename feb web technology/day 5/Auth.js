const { userInfo } = require("os");

class Auth {
  regiester() {
    // function
    console.log("Do Register");
  }
  login() {
    console.log("Do LogIn");
  }
}

class User {
  showInfo() {
    console.log("User Information.");
  }
}
module.exports = {
  Auth,
  User,
};
