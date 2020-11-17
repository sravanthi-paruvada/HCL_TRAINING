function valid() {
   
    var title = document.getElementById("titleId").value;
   var author = document.getElementById("authorId").value;
   var price =document.getElementById("priceid").value;
   var isbn = document.getElementById("isbnId").value;

    if(!isValidIsbn(isbn)) {
        document.getElementById("isbnid").innerHTML = "Enter valid isbn number";

        document.getElementById("isbnid").style.color="red";
        return false;
    }

    if(!isValidTitle(title)) {
        document.getElementById("titleid").innerHTML = "Enter valid title";
        document.getElementById("titleid").style.color="red";
        return false;
    }

    if(!isValidPrice(price)) {
        document.getElementById("priceid").innerHTML = "Enter valid number";
        document.getElementById("priceid").style.color="red";
        return false;
    }

    if(!isValidName(author)) {
        document.getElementById("authorid").innerHTML = "Enter valid publisher name";
        document.getElementById("authorid").style.color="red";
        return false;
    }

}