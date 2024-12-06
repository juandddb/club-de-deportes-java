# Club de Deportes - Sistema de Gestión 🏅

Este es un sistema de gestión para un club de deportes, donde se modelan jugadores y entrenadores. El proyecto está implementado en **Java** y hace uso de conceptos de **Herencia** y **Polimorfismo** para representar la estructura del club, calcular la efectividad de los jugadores, el sueldo de los entrenadores y mostrar la información relevante de cada miembro del club.

## 🚀 Descripción

El sistema permite gestionar a los jugadores y entrenadores de un club deportivo. La aplicación realiza los siguientes procesos:

- Cálculo de la efectividad de los jugadores en función de sus estadísticas.
- Cálculo del sueldo de los entrenadores según su antigüedad y categoría.
- Representación de los datos de jugadores y entrenadores mediante la implementación de métodos `toString()`.

## 🛠️ Tecnologías y Herramientas

- **Lenguaje de Programación**: Java
- **IDE**: Visual Studio Code
- **Control de Versiones**: Git

## ⚙️ Funcionalidades

- **Jugadores**: Representa a los jugadores con atributos como nombre, efectividad, etc. Se calcula su efectividad según las estadísticas proporcionadas.
- **Entrenadores**: Representa a los entrenadores con atributos como nombre, sueldo, categoría, entre otros.
- **Cálculos**: El sistema calcula automáticamente el sueldo de los entrenadores y la efectividad de los jugadores.
- **Herencia y Polimorfismo**: Las clases `Jugador` y `Entrenador` heredan de una clase base llamada `Empleado`, lo que permite aprovechar los principios de la programación orientada a objetos.

## 📂 Estructura de Archivos

- `Main.java`: Archivo principal donde se crea y gestiona el club, los jugadores y los entrenadores.
- `Jugador.java`: Clase que define a los jugadores y sus características.
- `Entrenador.java`: Clase que define a los entrenadores y su salario.
- `Empleado.java`: Clase base de la cual heredan tanto jugadores como entrenadores.

## 📈 Cómo ejecutar el proyecto

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/juandddb/club-de-deportes-java.git
