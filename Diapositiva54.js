//Actividad 3: Formulario con resultado.
let formulario = document.getElementById('miForm');
formulario.addEventListener('submit', function(e) {
    e.preventDefault(); // Evitar recarga
    
    let nombre = document.getElementById('nombre').value;
    let email = document.getElementById('email').value;
    
    if (nombre && email) {
        console.log('Nombre:', nombre);
        console.log('Email:', email);
    } else {
        alert('Completa todos los campos');
    }
});