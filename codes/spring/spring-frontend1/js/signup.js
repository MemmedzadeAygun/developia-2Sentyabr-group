function onTeacherSubmit(event){
    event.preventDefault();
    let teacherName=document.getElementById('teacher-name').value;
    let teacherSurname=document.getElementById('teacher-surname').value;
    let teacherUsername=document.getElementById('teacher-username').value;
    let teacherPassword=document.getElementById('teacher-password').value;
    let teacherEmail=document.getElementById('teacher-email').value;

    let teacherObject={
        name:teacherName,
        surname:teacherSurname,
        username:teacherUsername,
        password:teacherPassword,
        email:teacherEmail
    }

   let request=JSON.stringify(teacherObject);

   let xml=new XMLHttpRequest();
   xml.open('POST','http://localhost:8085/users/teacher',true);
   xml.setRequestHeader('Content-type','application/json');
   xml.send(request); 
}

let signIn=document.querySelector('button');

signIn.addEventListener('click', () => {
    window.location.href = "login.html";
})
