/* Lab 5 JavaScript File 
   Place variables and functions in this file */

   function validate(formObj) {
    // put your validation code here
    // it will be a series of if statements
 
    var alertText = "";
    var focusSet = 0;
 
    if (formObj.firstName.value == "") {
       alertText += "You must enter a first name \n";
       if (focusSet == 0) {
          formObj.comments.focus();
          focusSet = 1;
       }
    }
 
    if (formObj.lastName.value == "") {
       alertText += "You must enter a last name \n";
       if (focusSet == 0) {
          formObj.comments.focus();
          focusSet = 1;
       }
    }
 
    if (formObj.title.value == "") {
       alertText += "You must enter a title \n";
       if (focusSet == 0) {
          formObj.comments.focus();
          focusSet = 1;
       }
    }
 
    if (formObj.org.value == "") {
       alertText += "You must enter an organization \n";
       if (focusSet == 0) {
          formObj.comments.focus();
          focusSet = 1;
       }
    }
 
    if (formObj.pseudonym.value == "") {
       alertText += "You must enter a nickname \n";
       if (focusSet == 0) {
          formObj.comments.focus();
          focusSet = 1;
       }
    }
 
    if (formObj.comments.value == "Please enter your comments") {
       alertText += "You must enter a comment \n";
       if (focusSet == 0) {
          formObj.comments.focus();
          focusSet = 1;
       }
    }
    
    if (alertText == "") {
       alert("Form successfully submitted!");
       return true;
    }
 
    if (alertText != "") {
       alert(alertText);
       return true;
    }
 }
 
 function clearText() {
 
    var currentText = document.getElementById("comments");
    
    if (currentText.value == "Please enter a descrption of your conditions") {
       currentText.value = "";
    }
 }
 
 function defaultText() {
 
    var currentText = document.getElementById("comments");
    
    if (currentText.value == "") {
       currentText.value = "Please enter a descrption of your conditions";
    }
 }
 
 function nickname() {
    formObj = document.getElementById("addForm");
    if (formObj.firstName.value == "" || formObj.lastName.value == "" || form.obj.pseudonym.value == "") {
       alert("Missing either first name, last name or nickname.")
    }
    else {
       alert(formObj.firstName.value + " " + formObj.lastName.value + " is " + formObj.pseudonym.value);
    }
 }