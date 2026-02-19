//Actividad 2: Número primo.
const areaTriangulo = (base, altura) => {
    return (base * altura) / 2;
};
// Forma aún más corta (return implícito):
const areaTriangulo = (base, altura) => (base * altura) / 2;
console.log(areaTriangulo(10, 5)); // 25