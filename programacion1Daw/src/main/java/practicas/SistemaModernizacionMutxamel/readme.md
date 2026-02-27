<p align="center">
  <img src="img/banner.png" alt="Learning Curve Banner" width="100%">
</p>
<h1 align="center"> Práctica 2. Sistema de modernización para el MUTXAMEL FC vs Real Madrid </h1>
<h2 align="center"> Manuela Planelles - 1º DAW - IES Mutxamel</h2>

---
---

## Índice

1. [Introducción]()
2. [Objetivos de la práctica]()
3. [Diseño e Implementación del programa]()
   - [3.1. Estructura de clases]()
     - [Clase Enum Posiciones]()
     - [Clase Enum Equipos]()
     - [Clase Abstract MutxamelFC]()
     - [Clase Interface FuncionesIntegrantes]()
     - [Clase Interface FuncionesDeportivas]()
     - [Clase Masajista]()
     - [Clase Jugador]()
     - [Clase Acompañante]()
     - [Clase Entrenador]()
     - [Clase Exception ControlDorsal]()
     - [Clase Exception ControlformacionPreferida]()
     - [Clase AppMutxamelFC]()
     - [Clase AppMantenimiento]()
4. [Relaciones entre clases]()
5. [Plan de pruebas finales]()
6. [Documentación Javadoc]()
7. [Conclusión]()
    

---
---
## 1. Introducción
Esta aplicación simula el sistema de gestión del MUTXAMEL FC, un club de fútbol local que se ha clasificado para la Copa del Rey contra el Real Madrid. El objetivo es modernizar su organización mediante un software desarrollado en Java con Programación Orientada a Objetos.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

## 2. Objetivos de la práctica

La aplicación cubre dos partes principales:

- AppMutxamelFC: simula el día a día del club, desde la concentración hasta la celebración del gol.
- AppMantenimiento: permite gestionar los integrantes del club mediante un menú interactivo.

Los puntos trabajados en la práctica son:

- Herencia: clases que extienden de MutxamelFC
- Polimorfismo: cada clase implementa los métodos a su manera ("falta")
- Clase abstracta: MutxamelFC como base común
- Interfaces: FuncionesIntegrantes y AccionesDeportivas
- Enums: Equipos y Posiciones
- Excepciones personalizadas: dorsal duplicado y formato de formación incorrecto

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

## 3. Diseño e Implementación del programa

### 3.1. Estructura de clases

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Enum `Posiciones`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Enum `Equipos`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Abstract `MutxamelFC`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Interface `FuncionesIntegrantes`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Interface `FuncionesDeportivas`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Masajista`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Jugador`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Acompañante`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `Entrenador`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Exception `ControlDorsal`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase Exception `ControlformacionPreferida`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `AppMutxamelFC`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

#### Clase `AppMantenimiento`

<details>
<summary>Ver el código completo.</summary>
  
```java
```
</details>

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 4. Relaciones entre clases

**Jerarquía de herencia:**

**Explicación de las relaciones:**

La clase base es MutxamelFC, una clase abstracta que contiene los atributos comunes nombre y edad. Implementa la interfaz FuncionesIntegrantes, lo que obliga a todas sus subclases a saber concentrarse, viajar y celebrar goles.

De MutxamelFC heredan Jugador, Entrenador, Masajista y Acompanyante. Esto significa que todas comparten nombre y edad sin necesidad de repetirlos.

Jugador y Entrenador además implementan AccionesDeportivas, por lo que ambos saben entrenar y jugar partidos, aunque cada uno lo hace a su manera.

Jugador usa los enums Equipos y Posiciones para definir su categoría y posición en el campo. Entrenador usa Equipos para saber qué equipo dirige.

Acompanyante tiene una relación especial con Jugador, ya que contiene una referencia al jugador al que acompaña y su parentesco con él.

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 5. Plan de prueba final feliz

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 6. Documentación Javadoc

<p align="right"><a href="#índice">Ir al Índice</a></p>

---
---

## 7. Conclusión

<p align="right"><a href="#índice">Ir al Índice</a></p>

---

