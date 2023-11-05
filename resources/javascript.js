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

 function validate(formObj) {
    if (confirm("Are you ready to submit your APPLICATION NAME form?") == true) {
          location.href = '/selectdate.php';
       } else {
      }
 }
