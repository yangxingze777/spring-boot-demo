document.onreadystatechange = () => {
  if (document.readyState === "interactive") {
    console.log("from js");
  }
};

function showPassword() {
  var password = document.getElementById("password");
  if (password.type === "password") {
    password.type = "text";
  } else {
    password.type = "password";
  }
}