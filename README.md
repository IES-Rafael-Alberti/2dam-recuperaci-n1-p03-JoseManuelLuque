# Practica03 - Recuperación Trimestre 1

## Siete y Medio

### Objetivo:

El objetivo de esta práctica es aplicar los conceptos de Jetpack Compose, Kotlin y programación orientada a objetos para desarrollar el juego del Siete y Medio en Android Studio. En esta versión, se introducirán un solo modo de juego de 2 jugadores y se implementarán clases adicionales para gestionar la baraja, las cartas y los jugadores.

Para incluir la navegación, la app debe mostrar una pantalla principal con 2 botones: "Carta más alta" y "Siete y medio"... que nos llevarán al screen de cada juego.

### Requisitos Básicos:
1. Interfaz Gráfica:

   ```
   Diseñar la interfaz del juego utilizando Jetpack Compose, considerando la pantalla principal y la navegación.
   Mostrar las cartas de los jugadores de manera clara y atractiva (imágenes).
   ```

2. Lógica del Juego:

   ```
   Implementar la lógica del juego del Siete y medio para un modo de 2 juegadores.
   Esto incluye la distribución inicial de cartas, el cálculo de la puntuación de la mano y las decisiones del jugador (pedir carta, plantarse, etc.).
   ```

3. Manejo de Estado:

   ```
   Utilizar ViewModels para gestionar el estado del juego de manera eficiente.
   Actualizar la interfaz de usuario de acuerdo con el estado actual del juego.
   ```

4. Clases Enumeradas:

   ```
   Crear dos clases enumeradas: una para definir los palos de la baraja y otra para los nombres de las cartas de cada palo.
   ```
   
5. Clase Baraja:

   ```
   Crear una clase Baraja con un companion object que contenga:
   - Una lista de objetos Carta que representan las cartas de la baraja.
   - Métodos para crear una nueva baraja y barajar o desordenar las cartas.
   ```

### Clases Adicionales:

1. Clase Carta:

   ```
   Crear una clase Carta que represente una carta de la baraja con propiedades como palo, nombre, valor...
   ```

2. Clase Jugador:

   ```
   Crear una clase Jugador que tenga propiedades como nombre, mano (conjunto de cartas), etc.
   ```
   
### Recursos:

   * Documentación oficial de Jetpack Compose: [Compose Overview](https://developer.android.com/jetpack/compose?hl=es-419)
   * Documentación oficial de Kotlin: [Kotlin Docs](https://kotlinlang.org/docs/home.html)
   * Recuerda fomentar la modularidad y la reutilización del código mediante la implementación de clases y objetos bien estructurados.
