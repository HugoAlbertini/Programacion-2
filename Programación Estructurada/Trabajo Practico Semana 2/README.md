# 📚 TP3: Introducción a la Programación Orientada a Objetos

<div align="center">
  
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-007396?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/POO-8A2BE2?style=for-the-badge&logo=java&logoColor=white)

</div>

## ✨ Descripción general

Este repositorio contiene el desarrollo del Trabajo Práctico 3 de la asignatura Programación II, enfocado en los fundamentos de la Programación Orientada a Objetos en Java. Se abordan conceptos como clases, objetos, atributos, métodos, encapsulamiento y reutilización de código.

---

## 🎯 Objetivo general

Comprender los fundamentos de la Programación Orientada a Objetos, incluyendo clases, objetos, atributos y métodos, para estructurar programas de manera modular y reutilizable en Java.

---

## 📚 Marco teórico (conceptos y su aplicación)

- 🔸 **Clases y Objetos**: Modelado de entidades como Estudiante, Mascota, Libro, Gallina y NaveEspacial.
- 🔸 **Atributos y Métodos**: Definición de propiedades y comportamientos para cada clase.
- 🔸 **Estado e Identidad**: Cada objeto conserva su propio estado (edad, calificación, combustible, etc.).
- 🔸 **Encapsulamiento**: Uso de modificadores de acceso y getters/setters para proteger datos.
- 🔸 **Modificadores de acceso**: Uso de private, public y protected para controlar visibilidad.
- 🔸 **Getters y Setters**: Acceso controlado a atributos privados mediante métodos.
- 🔸 **Reutilización de código**: Definición de clases reutilizables en múltiples contextos.

---

## 🧭 Índice (Tabla de contenidos)

- [Casos Prácticos](#-casos-prácticos)
- [Registro de Estudiantes](#-registro-de-estudiantes)
- [Registro de Mascotas](#-registro-de-mascotas)
- [Encapsulamiento con la Clase Libro](#-encapsulamiento-con-la-clase-libro)
- [Gestión de Gallinas en Granja Digital](#-gestión-de-gallinas-en-granja-digital)
- [Simulación de Nave Espacial](#-simulación-de-nave-espacial)
- [Conclusiones Esperadas](#-conclusiones-esperadas)
- [Cómo ejecutar](#-cómo-ejecutar)
- [Autor](#-autor)

---

## 📋 Casos Prácticos

Cinco ejercicios para aplicar los conceptos de programación orientada a objetos en Java:

### 🎓 Registro de Estudiantes

<details>
  <summary><strong>Crear una clase Estudiante con atributos y métodos</strong></summary>

```java
class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    // Métodos
    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + " puntos");
    }
    
    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificación reducida en " + puntos + " puntos");
    }
}
