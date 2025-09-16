# 💻 Trabajo Práctico 4 - Programación Orientada a Objetos II

📚 **Materia:** Programación II  
🏫 **Carrera:** Tecnicatura Universitaria en Programación a Distancia  
👨‍🎓 **Alumno:** Hugo Agustin Albertini  
🛠️ **Lenguaje:** Java  
🧠 **Paradigma:** Programación Orientada a Objetos (POO)

---

## 🎯 Objetivo General

Aplicar conceptos fundamentales de la POO en Java para desarrollar un sistema modular y reutilizable. Se trabajará con:

- `this`
- Constructores y sobrecarga
- Encapsulamiento
- Métodos y atributos estáticos
- Métodos sobrecargados
- `toString()`

---

## 🧠 Marco Teórico

| Concepto               | Aplicación en el Proyecto                                      |
|------------------------|---------------------------------------------------------------|
| `this`                 | Referencia a la instancia actual                              |
| Constructores          | Inicialización flexible de objetos                            |
| Métodos sobrecargados  | Variantes de métodos según parámetros                         |
| `toString()`           | Representación legible del objeto                             |
| Atributos estáticos    | Variables compartidas entre instancias                        |
| Métodos estáticos      | Funciones de clase sin necesidad de instanciar                |
| Encapsulamiento        | Protección de atributos mediante getters y setters            |

---

## 🧪 Caso Práctico: Sistema de Gestión de Empleados

### 📦 Clase `Empleado`

```java
private int id;
private String nombre;
private String puesto;
private double salario;
private static int totalEmpleados;

