function main(){
fetch("http://localhost:8080/",
    {
        method: "POST",
        body: "name=manas&age=20",
        headers:
            {
                "Content-Type": "application/x-www-form-urlencoded"
            }

    }).then((response) =>
{
    console.log(response)
});}
let buttonElement=document.getElementById("1");
buttonElement.addEventListener('click', main);