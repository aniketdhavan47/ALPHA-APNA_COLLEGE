const express = require("express");
const router = express.Router();
const {
  registerUser,
  loginUser,
  getUser,
  updateUser,
  deleteUser,
} = require("../controllers/userCtrls");

//API Route for user
router.post("/register", registerUser);
router.post("/login", loginUser);
router.get("/getuser/:email", getUser);
router.put("/updateuser", updateUser);
router.delete("/deleteuser/:email", deleteUser);

module.exports = router;
