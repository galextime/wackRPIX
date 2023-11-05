function clearText() {
 
    var currentText = document.getElementById("comments");
    
    if (currentText.value == "Please type a description of your condition here") {
       currentText.value = "";
    }
 }
 
 function defaultText() {
 
    var currentText = document.getElementById("comments");
    
    if (currentText.value == "") {
       currentText.value = "Please type a description of your condition here";
    }
 }

 let text = ""
 function getCheckedCheckboxIds() {
    const checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
    const currentText = document.getElementById("comments");
    const ids = Array.from(checkboxes).map(checkbox => checkbox.id);
    let string = ids.join('&');
    let message = string.concat('&',currentText.value);
    alert(message);
  }