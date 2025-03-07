// function onLoadStudents(){

//    let xml=new XMLHttpRequest();
//    xml.onload=function(){
//     console.log(this.responseText);

//      let massiv = JSON.parse(this.responseText);
//      massiv.students.forEach(element => {
//         document.getElementById('students').innerHTML+= "<tr><td>"
//         +element.id+"</td><td>"
//         +element.name+"</td><td>"
//         +element.surname+"</td></tr>";
//      });

//    }
//    xml.open('GET','http://localhost:8085/students',true);
//    xml.send(); 
// }

// onLoadStudents();

const username = localStorage.getItem('username');
const password = localStorage.getItem('password');
const token = "Basic " + btoa(username + ":" + password);

function onLoadStudents() {
    fetch('http://localhost:8085/students', {
        method: 'GET',
        headers: {
            'Authorization': token
        }
    })
    .then(response => response.json())
    .then(data => {
        console.log(data);
        let tableContent = "";
        data.students.forEach(element => {
            tableContent += `
            <tr><td>${element.id}</td>
            <td>${element.name}</td>
            <td>${element.surname}</td></tr>
            `;
        });
        document.getElementById('students').innerHTML += tableContent;
    });
}

onLoadStudents();


let logOutBtn=document.querySelector('button');

function logout(){
    logOutBtn.addEventListener('click', () => {
        localStorage.removeItem('username');
        localStorage.removeItem('password');
    
        window.location.href = "login.html";
    });
}

logout();
