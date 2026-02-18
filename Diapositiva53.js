//Actividad 1: Cambiar fondo con botón.
const colores = ['white', 'lightblue', 'lightgreen', 'pink'];
let indice = 0;
boton.addEventListener('click', () => {
    indice = (indice + 1) % colores.length;
    document.body.style.backgroundColor = colores[indice];
});

//Actividad 2: Mostrar/Ocultar texto
boton.addEventListener('click', () => {
    if (elemento.style.display === 'none') {
        elemento.style.display = 'block';
    } else {
        elemento.style.display = 'none';
    }
});