//Actividad 1: Par o impar.
for (let i = 1; i <= 10; i++) {
    if (i % 2 === 0) {
        console.log(i + ' es par');
    } else {
        console.log(i + ' es impar');
    }
}


//Actividad 2: Nota final.
let suma = 0;
for (let i = 0; i < notas.length; i++) {
    suma += notas[i];
}
let media = suma / notas.length;
console.log('Nota media:', media);


//Actividad 3: Lista de nombres.
for (let i = 1; i <= 10; i++) {
    console.log('5 x ' + i + ' = ' + (5 * i));
}


//Actividad 4: Tabla de multiplicacion.
for(let i= 1; i <= 10; i++){
    console.log('5 x ${i} = ${5*i}')
}
