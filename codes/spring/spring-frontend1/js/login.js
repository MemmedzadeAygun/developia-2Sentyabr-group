//usul1

// let API_URL = "http://localhost:8085";
// let usernameInput=document.getElementById('username');
// let passwordInput=document.getElementById('password');

// function onLogin(event){
//     event.preventDefault();
//     let username=usernameInput.value;
//     let password=passwordInput.value;

//     let http=new XMLHttpRequest();
//     http.onload=function(){
//         console.log(this.status);
        
//         if (this.status==200) {
//             localStorage.setItem('username',username);
//             localStorage.setItem('password',password);
//             window.location.href="students.html";
//         }else{
//             console.log("melumatlar sehvdir");
            
//         }
//     }
//     http.open("GET", API_URL + "/users/login",true);
//     http.setRequestHeader("Authorization","Basic " + window.btoa(username + ":" + password));
//     http.send();
// }


//usul 2

let API_URL = "http://localhost:8085";
let usernameInput=document.getElementById('username');
let passwordInput=document.getElementById('password');

function onLogin(event){
    event.preventDefault();
    let username=usernameInput.value;
    let password=passwordInput.value;

   fetch(API_URL + "/users/login",{
        method:"GET",
        headers:{
            "Authorization":"Basic " + btoa(username + ":" +password)
        }
    })
    .then(response=>{
        if (response.status===200) {
            localStorage.setItem('username',username);
            localStorage.setItem('password',password);
            window.location.href="students.html";
        }else if (response.status===401) {
            return response.text().then(text=>{
              alert("Username ve ya parol sehvdir!!!");  
            });
        }
    })
}

let signup=document.querySelector('button');

signup.addEventListener('click', ()=>{
    window.location.href = "signup.html";
})

