# Trabajos prácticos de programación orientada a objetos

Soluciones en Java para Visual Studio Code. Para ejecutarlas necesitás un JDK 11
o posterior y las extensiones recomendadas para Java.

## Cómo ejecutar

1. En Visual Studio Code, abrí la carpeta raíz del repositorio con **Archivo → Abrir carpeta**.
2. Si VS Code te ofrece instalar las extensiones recomendadas, instalalas.
3. Abrí **Ejecutar y depurar** con **Ctrl+Shift+D** y elegí el ejercicio de la lista.
4. Presioná **Ctrl+F5** para ejecutarlo. El resultado aparece en la terminal integrada.

En `src`, cada ejercicio tiene su propio paquete con un `Main.java` y un archivo por clase.

## Ejercicios

| TP 1 · Clases y objetos | TP 2 · Herencia simple y validaciones |
| --- | --- |
| 1. Persona | 1. Persona y Empleado |
| 2. Libro | 2. Vehiculo y Auto |
| 3. Auto | 3. Animal y Perro |
| 4. CuentaBancaria | |
| 5. Rectangulo | |

El archivo [Diagramas_UML.pdf](Diagramas_UML.pdf) contiene un diagrama por ejercicio.

En el punto 4 del TP 1 se usa el nombre `CuentaBancaria`. En el punto 5 se usa
`Rectangulo` porque es la clase definida en la consigna. En el TP 2 se comprueba
que la edad sea mayor o igual a cero, que el salario sea finito y mayor o igual
a cero, y que la cantidad de puertas sea positiva.
