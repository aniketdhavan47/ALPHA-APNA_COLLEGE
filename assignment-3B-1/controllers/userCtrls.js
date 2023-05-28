const User = require("../models/userModel");

exports.registerUser = (req, res) => {
    try {
      console.log(req.body);
    const user = new User(req.body);
    user.save((err, result) => {
      if (err || !result) {
        res.json({
          success: false,
          msg: err,
        });
      } else {
        res.json({
          success: true,
          data: result,
        });
      }
    });
  } catch (err) {
    console.log(err);
  }
};

exports.loginUser = (req, res) => {
  try {
    User.findOne({
      email: req.body.email,
      password: req.body.password,
    }).exec((err, user) => {
      if (err || !user) {
        res.json({
          success: false,
        });
      } else {
        user.password = "";
        res.json({
          success: true,
          data: user,
        });
      }
    });
  } catch (err) {
    console.log(err);
  }
};

exports.updateUser = (req, res) => {
  try {
    User.findOneAndUpdate({ email: req.body.email }, req.body, { new: true }).exec(
      (err, user) => {
        if (err || !user) {
          res.json({
            success: false,
          });
        } else {
          user.password = "";
          res.json({
            success: true,
            data: user,
          });
        }
      }
    );
  } catch (err) {
    console.log(err);
  }
};

exports.getUser = (req, res) => {
    console.log(req.params);
  try {
    User.findOne({
      email: req.params.email,
    }).exec((err, user) => {
      if (err || !user) {
        res.json({
          success: false,
        });
      } else {
        user.password = "";
        res.json({
          success: true,
          data: user,
        });
      }
    });
  } catch (err) {
    console.log(err);
  }
};

exports.deleteUser = (req, res) => {
  try {
    User.findOneAndDelete({
      email: req.params.email,
    }).exec((err, user) => {
      if (err || !user) {
        res.json({
          success: false,
        });
      } else {
        res.json({
          success: true,
        });
      }
    });
  } catch (err) {
    console.log(err);
  }
};
