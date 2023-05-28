$(document).ready(function () {
  getData();
});

function getData() {
  let localStorageData = localStorage.getItem("student");
  let studentObj = JSON.parse(localStorageData);
  console.log(studentObj);
  
  $("#firstName").text(studentObj.firstName);
  $("#lastName").text(studentObj.lastName);
 
  
  $("#email").text(studentObj.email);
  $("#contactNo").text(studentObj.contactNo);
  $("#branch").text(studentObj.branch);
 
}
