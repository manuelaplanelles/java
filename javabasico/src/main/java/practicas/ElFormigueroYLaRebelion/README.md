![Banner](/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/img_doc/banner.png)

# Práctica 1. "El Formiguero" y "La Rebelión"

Manuela Planelles - 1º DAW - IES Mutxamel

---

## Índice

1. [Introducción](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#1-introducci%C3%B3n)
2. [Objetivos de la práctica](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#2-objetivos-de-la-pr%C3%A1ctica)
3. [Diseño e Implementación del programa.](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#3-dise%C3%B1o-e-implementaci%C3%B3n-del-programa)
   - [3.1. Estructura de clases](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#31-estructura-de-clases)
     - [3.1.1. Clase `AppProgramas`](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#clase-appprogramas)
     - [3.1.4. Clase `Empleado`](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#clase-empleado)
     - [3.1.5. Clase `Invitado`]()
     - [3.1.2. Clase `Cadena`]()
     - [3.1.3. Clase `Programa`]()
   - [3.2. Métodos requeridos](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#32-m%C3%A9todos-extras-implementados)
4. [Relaciones entre clases](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#4-relaciones-entre-clases)
5. [Ejemplo de funcionamiento](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#5-ejemplo-de-funcionamiento)
6. [Plan de pruebas](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#6-plan-de-pruebas)
   - [6.1. Pruebas final feliz.](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#61-pruebas-final-feliz)
   - [6.2. Pruebas con JUnit5.](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#62-pruebas-con-junit5)
7. [Documentación Javadoc](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#7-documentaci%C3%B3n-javadoc)
8. [Diagrama UML:** Crear el diagrama UML con PlantUML.](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#8-diagrama-uml-crear-el-diagrama-uml-con-plantuml)

---


## 1. Introducción.

El presente documento recoge el desarrollo de la práctica número 1 de la asignatura de Programación 1, correspondiente al módulo de Desarrollo de Aplicaciones Web. 

El contexto de la práctica se centra en el mundo de la televisión, donde se observa una situación de confrontación entre distintos programas. El objetivo es desarrollar una aplicación que permita recoger datos diarios sobre estos programas para aportar objetividad a las distintas informaciones que van surgiendo.

---

## 2. Objetivos de la práctica.

La práctica persigue los siguientes objetivos:

- Desarrollar una aplicación en Java que gestione información sobre cadenas de televisión, programas, empleados e invitados.
- Implementar relaciones de **composición** entre las clases `Programa`, `Empleado` e `Invitado`.
- Implementar relaciones de **asociación/agregación bidireccional** entre las clases `Cadena` y `Programa`.
- Aplicar conceptos de Programación Orientada a Objetos: encapsulación, constructores, getters, setters y sobreescritura de métodos.
- Implementar métodos de gestión de colecciones (ArrayList).
- Desarrollar métodos específicos de búsqueda y filtrado de información.

---

## 3. Diseño e Implementación del programa.

### 3.1. Estructura de clases

Creamos las clases que se solicitan con sus atributos.

![Clases y atributos](./img_doc/clases%20y%20atributos.jpg)

---
#### Clase AppProgramas
Creamos la clase AppProgramas, unicamente con el main e iremos completandola para las pruebas.
```java
public class AppProgramas {
    public static void main(String[] args) {

    }
}
```
---

#### Clase Empleado
- Para generar el Id automático creamos la función .format para formatear el número con 3 digitos y un contador que va incrementando
```java
private String generarId(){
        String id = String.format("EP%03d", contadorId);
        contadorId++;
        return id;
    }
```
- Creamos el contructor llamando a setCargo para validar el cargo y comprobar que si es director sea nulo.
```java
 public Empleado(String nombre, String cargo, Empleado director) {
        this.id = generarId();
        this.nombre = nombre;
        setCargo(cargo);

        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }
```
- Le damos valores a cargo y si no es uno de eso se indica con valor por defecto null. Esto lo indicamos en el método setCargo.
```java
   public void setCargo(String cargo) {
        String[] cargosValidos = {"director", "técnico", "presentador", "colaborador"};
        boolean esValido = false;

        for (String cargoValido : cargosValidos) {
            if (cargoValido.equalsIgnoreCase(cargo)) {
                esValido = true;
                break;
            }
        }
        if (esValido) {
            this.cargo = cargo.toLowerCase();
        } else {
            this.cargo = "pte";
        }
    }
 ```
- Sobre escribimos el método toString, para mostrar el nombre del director o  si no hay.
```java
 @Override
    public String toString() {
        String directorInfo = (director != null) ? director.getNombre() : "Sin director (es director)";
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + directorInfo +
                '}';
    }
```

<details>
<summary>Ver el código completo de la clase Empleado</summary>

```java
public class Empleado {
    private static int contadorId = 1;
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    private String generarId(){
        String id = String.format("EP%03d", contadorId);
        contadorId++;
        return id;
    }
    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = generarId();
        this.nombre = nombre;
        setCargo(cargo);

        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }


    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Empleado.contadorId = contadorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        String[] cargosValidos = {"director", "técnico", "presentador", "colaborador"};
        boolean esValido = false;

        for (String cargoValido : cargosValidos) {
            if (cargoValido.equalsIgnoreCase(cargo)) {
                esValido = true;
                break;
            }
        }
        if (esValido) {
            this.cargo = cargo.toLowerCase();
        } else {
            this.cargo = "pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        String directorInfo = (director != null) ? director.getNombre() : "Sin director (es director)";
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + directorInfo +
                '}';
    }
}
```

</details>

[Comprobación 1.](https://github.com/manuelaplanelles/1Daw/blob/main/javabasico/src/main/java/practicas/ElFormigueroYLaRebelion/README.md#comprobamos--la-lista-de-empleados-un-empleado-no-puede-ser-director-y-si-no-es-ning%C3%BAn-de-los-valores-se-guarda-como-pte)

---

#### Clase Invitado
- La única condición es que la la fecha por defecto (LocalDate) y se crean los atriburos, el constructor, los set, los get y toString.

<details>
<summary>Ver el código completo de la clase Empleado</summary>

```java
import java.time.LocalDate;

public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado (String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = LocalDate.now();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}

```
</details>

 [Comprobación 2.]()
 
---

### 3.2. Métodos extras implementados


---

## 4. Relaciones entre clases

| Relación | Tipo | Descripción |
|----------|------|-------------|
| `Programa` — `Empleado` | Composición | Si un objeto Programa se destruye, desaparecen también sus empleados asociados. |
| `Programa` — `Invitado` | Composición | Si un objeto Programa se destruye, desaparecen también sus invitados asociados. |
| `Cadena` — `Programa` | Asociación/Agregación bidireccional | Se conocen la una a la otra y ambas existen por sí solas. |

---
## 5. Ejemplo de funcionamiento

##### Comprobamos  la lista de empleados, un empleado no puede ser director, y si no es ningún de los valores se guarda como pte
  ![Clases y atributos](./img_doc/pruebas_empleado.jpg)


---

## 6. Plan de pruebas
### 6.1. Pruebas final feliz.
Realiza las pruebas manuales necesarias para comprobar que el programa funciona bien.
---
### 6.2. Pruebas con JUnit5.
Pruebas unitarias de los método implementados con JUnit5.
---
## 7. Documentación Javadoc:
Comentar el código siguiendo el estándar Javadoc.
---
## 8. Diagrama UML:
Crear el diagrama UML con PlantUML.

---



















