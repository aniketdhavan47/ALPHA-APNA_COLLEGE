const mongoose = require("mongoose");
//user schema
const userSchema = mongoose.Schema({
  name: { type: String, required: true },
  email: { type: String, required: true },
  password: { type: String, required: true },
  gender: { type: String, required: true },
  branch: { type: String, required: true },
});

//export userSchema
module.exports = mongoose.model("users", userSchema);
