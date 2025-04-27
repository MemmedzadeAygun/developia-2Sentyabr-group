
const registerForm = document.querySelector('form');

registerForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const user = {
        firstName: document.getElementById('firstName').value,
        lastName: document.getElementById('lastName').value,
        username: document.getElementById('username').value,
        password: document.getElementById('password').value,
        email: document.getElementById('email').value
    }

    fetch('http://localhost:9999/auth/register', {
        method: 'POST',
        headers: {
            'Content-Type':'application/json'
        },
        body: JSON.stringify(user)
    })
    .then(async response => {
        if (response.ok) {
            const message = await response.text();
            alert(message);
            document.getElementById('firstName').value = "";
            document.getElementById('lastName').value = "";
            document.getElementById('username').value = "";
            document.getElementById('password').value = "";
            document.getElementById('email').value = "";
        }else{
            const data = await response.json();
            alert(data.message);
        }
    })
})