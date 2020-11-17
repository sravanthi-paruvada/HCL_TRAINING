function valid(){
var isbn=document.getElementById("isbnId").value;
var title=document.getElementById("titleId").value;
var price=document.getElementById("priceId").value;
var type=document.getElementById("typeId").value;
var Copies=document.getElementById("CopiesId").value;
var publisher=document.getElementById("publisherId").value;
var Author=document.getElementById("AuthorId").value;

if(isbn==""){
    document.getElementById("isbnmsg").innerHTML="ISBN field cannot be empty";
    return false;
}
if(title==""){
    document.getElementById("titlemsg").innerHTML="Title field cannot be empty";
    return false;
}
if(price=="" || isNaN(price)){
    document.getElementById("pricemsg").innerHTML="Enter valid price";
    return false;
}
if(type==""){
    document.getElementById("booktypemsg").innerHTML="Type field cannot be empty";
    return false;
}

if(isNaN(Copies)){
    document.getElementById("copiesmsg").innerHTML="Please Enter valid number of copies";
    return false;
}

if(Copies=="" || Copies<1){
    document.getElementById("copiesmsg").innerHTML="Enter atleast 1 copy";
    return false;
}
if(publisher==""){
    document.getElementById("publishermsg").innerHTML="Publisher field cannot be empty";
    return false;
}
if(Author==""){
    document.getElementById("authormsg").innerHTML="Author field cannot be empty";
    return false;
}
alert('Data is submitted!!!');
return true;
}