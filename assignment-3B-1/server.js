const express = require('express');
const cors = require('cors');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');


const app = express();
const port = 3000;

const userRoutes = require("./routes/userRoutes");

app.use(cors())
app.use(express.urlencoded({extended: true}));
app.use(express.json());
app.use(bodyParser.urlencoded({ extended: true }))
const allowedOrigins = [
  "capacitor://localhost",
  "ionic://localhost",
  "http://localhost",
  "http://localhost:4200",
];

// Reflect the origin if it's in the allowed list or not defined (cURL, Postman, etc.)
const corsOptions = {
  origin: (origin, callback) => {
    if (allowedOrigins.includes(origin) || !origin) {
      callback(null, true);
    } else {
      callback(new Error("Origin not allowed by CORS"));
    }
  },
};

// Enable preflight requests for all routes
app.options("*", cors(corsOptions));

//Connect with MongoDB DB - puneuniversity
mongoose
  .connect("mongodb://localhost:27017/puneuniversity", {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  })
  .then(() => {
    console.log("Connection Success..!");
  })
  .catch(() => {
    console.log("Connection Unsuccessful..!");
  });

app.use("/api", userRoutes);

app.listen(port, () => {
    console.log(`Server Started on ${port}`);
})