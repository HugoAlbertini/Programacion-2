<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&height=200&text=Programación%20II%20—%20TP2&fontAlign=50&color=0:00C6FF,100:8A2BE2&fontColor=ffffff&animation=twinkling&fontSize=45" alt="Banner"/>

<p>
  <img alt="Lenguaje" src="https://img.shields.io/badge/Lenguaje-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white">
  <img alt="Paradigma" src="https://img.shields.io/badge/Paradigma-Estructurada-00C6FF?style=for-the-badge">
  <img alt="Estado" src="https://img.shields.io/badge/Estado-Activo-success?style=for-the-badge">
  <img alt="JDK" src="https://img.shields.io/badge/JDK-8%2B%20%7C%2017%2B-8A2BE2?style=for-the-badge">
</p>

<p>
  <em>TECNICATURA UNIVERSITARIA EN PROGRAMACIÓN (A DISTANCIA)</em>
</p>

</div>

---

## ✨ Descripción general

Este repositorio contiene el desarrollo del Trabajo Práctico 2 de la asignatura Programación II, enfocado en reforzar los fundamentos de la programación estructurada en Java. Se abordan operadores, estructuras de control (condicionales e iterativas), modularización con funciones, manejo de arrays y recursividad.

---

## 🎯 Objetivo general

Desarrollar habilidades en programación estructurada en Java, abordando desde conceptos básicos como operadores y estructuras de control hasta temas avanzados como funciones, recursividad y estructuras de datos. Se busca fortalecer la capacidad de análisis y solución de problemas mediante un enfoque práctico.

---

## 📚 Marco teórico (conceptos y su aplicación)

- 🔸 Estructuras condicionales: Clasificación de edad, verificación de año bisiesto.  
- 🔸 Ciclos (for, while, do-while): Repetición de ingreso de datos y cálculos.  
- 🔸 Funciones: Cálculo modular de descuentos, envíos y stock.  
- 🔸 Arrays: Gestión de precios de productos.  
- 🔸 Recursividad: Impresión recursiva de arrays.

---

## 🧭 Índice (Tabla de contenidos)

- [Estructuras Condicionales](#-estructuras-condicionales)
- [Estructuras de Repetición](#-estructuras-de-repetición)
- [Funciones](#-funciones)
- [Arrays y Recursividad](#-arrays-y-recursividad)
- [Conclusiones Esperadas](#-conclusiones-esperadas)
- [Cómo ejecutar](#-cómo-ejecutar)
- [Autor](#-autor)

---

## 🧩 Estructuras Condicionales

<details>
  <summary><strong>1) Verificación de Año Bisiesto</strong></summary>

Regla: Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.

```text
Ingrese un año: 2024
El año 2024 es bisiesto.

Ingrese un año: 1900
El año 1900 no es bisiesto.
```
</details>

<details>
  <summary><strong>2) Determinar el Mayor de Tres Números</strong></summary>

```text
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12
```
</details>

<details>
  <summary><strong>3) Clasificación de Edad</strong></summary>

- Menor de 12 años: "Niño"  
- Entre 12 y 17 años: "Adolescente"  
- Entre 18 y 59 años: "Adulto"  
- 60 años o más: "Adulto mayor"  

```text
Ingrese su edad: 25
Eres un Adulto.

Ingrese su edad: 10
Eres un Niño.
```
</details>

<details>
  <summary><strong>4) Calculadora de Descuento según Categoría</strong></summary>

- Categoría A: 10% de descuento  
- Categoría B: 15% de descuento  
- Categoría C: 20% de descuento  

```text
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
```
</details>

---

## 🔁 Estructuras de Repetición

<details>
  <summary><strong>5) Suma de Números Pares (while)</strong></summary>

```text
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
```
</details>

<details>
  <summary><strong>6) Contador de Positivos, Negativos y Ceros (for)</strong></summary>

```text
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
```
</details>

<details>
  <summary><strong>7) Validación de Nota entre 0 y 10 (do-while)</strong></summary>

```text
Ingrese una nota (0-10): 15
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): -2
Error: Nota inválida. Ingrese una nota entre 0 y 10.
Ingrese una nota (0-10): 8
Nota guardada correctamente.
```
</details>

---

## 🧮 Funciones

<details>
  <summary><strong>8) Cálculo del Precio Final con Impuesto y Descuento</strong></summary>

Método sugerido:  
<code>calcularPrecioFinal(double precioBase, double impuesto, double descuento)</code>  

Fórmula:  
<code>PrecioFinal = PrecioBase + (PrecioBase × Impuesto) − (PrecioBase × Descuento)</code>

```text
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
```
</details>

<details>
  <summary><strong>9) Composición de Funciones — Costo de Envío y Total de Compra</strong></summary>

a) <code>calcularCostoEnvio(double peso, String zona)</code>  
- Nacional: $5 por kg  
- Internacional: $10 por kg  

b) <code>calcularTotalCompra(double precioProducto, double costoEnvio)</code>  
Usa <em>calcularCostoEnvio</em> para sumar precio + envío.

```text
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.0
```
</details>

<details>
  <summary><strong>10) Actualización de Stock (venta y recepción)</strong></summary>

Método:  
<code>actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida)</code>  

Fórmula correcta:  
<code>NuevoStock = StockActual − CantidadVendida + CantidadRecibida</code>

```text
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
```
</details>

<details>
  <summary><strong>11) Descuento Especial con Variable Global</strong></summary>

Variable global sugerida: <code>double descuentoEspecial = 0.10;</code>  
Método: <code>calcularDescuentoEspecial(double precio)</code>  
Usar una variable local <code>descuentoAplicado</code> para almacenar el valor y mostrar el precio final.

```text
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
```
</details>

---

## 🧵 Arrays y Recursividad

<details>
  <summary><strong>12) Modificación de un Array de Precios y Visualización</strong></summary>

- Declarar e inicializar un array con precios de productos.  
- Mostrar precios originales.  
- Modificar el precio de un producto específico (por índice).  
- Mostrar precios modificados.  

```text
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99

Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99
```

Conceptos clave:
- Uso de arrays (double[]) para almacenar valores.  
- Recorrido con for-each para mostrar valores.  
- Modificación de un valor en un array mediante un índice.  
- Reimpresión del array después de la modificación.
</details>

<details>
  <summary><strong>13) Impresión Recursiva de Arrays (antes y después de modificar)</strong></summary>

- Función recursiva para imprimir los precios originales.  
- Modificar el precio de un producto (por índice).  
- Función recursiva para imprimir los valores modificados.  

```text
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99

Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99
```

Conceptos clave:
- Uso de arrays (double[]) para almacenar valores.  
- Recorrido con recursividad en lugar de bucles.  
- Modificación por índice.  
- Uso de un índice como parámetro para recorrer el array recursivamente.
</details>

---

## ✅ Conclusiones Esperadas

- ✔️ Aplicar estructuras de control y decisión para resolver problemas.  
- ✔️ Diseñar soluciones usando estructuras iterativas y condicionales.  
- ✔️ Modularizar el código utilizando funciones con y sin retorno.  
- ✔️ Utilizar arrays para almacenamiento y manipulación de datos.  
- ✔️ Comprender y aplicar la recursividad en casos simples.  
- ✔️ Trabajar con variables locales y globales de forma adecuada.  
- ✔️ Fortalecer la capacidad de análisis lógico y la resolución de errores.  
- ✔️ Consolidar el uso del lenguaje Java mediante la práctica estructurada.

---

## 🚀 Cómo ejecutar

- Requisitos: JDK 8+ (recomendado JDK 17 o superior).  
- Compilación (ejemplo en consola, dentro del directorio del código fuente):
  ```bash
  javac *.java
  ```
- Ejecución (ejemplo, suponiendo una clase con método main llamado Main):
  ```bash
  java Main
  ```
Ajusta los comandos según la estructura real del proyecto (paquetes, carpetas src/, etc.).

---

## 👤 Autor

- Hugo Albertini (@HugoAlbertini)

<div align="center">
  
<img src="https://img.shields.io/badge/Gracias%20por%20visitar%20el%20repo-💙-00C6FF?style=for-the-badge">

</div>