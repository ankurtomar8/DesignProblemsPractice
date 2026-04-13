# ProgramRunner

A comprehensive collection of Java and Android programming examples, focusing on core concepts, design patterns, and modern Java features.

## Project Structure

The project is divided into multiple modules:

### 1. JavaProgramRunner
This module contains standalone Java programs covering various topics:

*   **Java Streams API**: Located in `src/main/java/StreamRevisionApril2026` and `src/main/java/com/example/StreamQuestions`. Includes solutions for:
    *   Even/Odd number filtering.
    *   Finding frequency of characters.
    *   Finding first non-repeating characters.
    *   Removing null values from lists.
    *   Creating custom collectors.
*   **Design Patterns**: Located in `src/main/java/DesignPattern`. Includes implementations of:
    *   **Observer Pattern**: Weather station example with `ForecastDisplay`, `CurrentStatDisplay`, etc.
    *   **Strategy Pattern**: `LoginStrategyFactory` and `Client` implementations.
    *   **Builder Pattern**: Example implementations.
*   **Revision & Coding Challenges**: Located in `src/main/java/com/example/Revision` and `src/main/java/com/example/RevisionV1`.
    *   Frequency of characters in a string.
    *   General algorithmic problems.

### 2. Android App (`app`)
The main Android application module.

*   **lib**: A shared library module used within the app.

## Technologies Used
*   **Java 8+**: Extensive use of Streams, Lambdas, and Functional Interfaces.
*   **Android SDK**: For the mobile application components.
*   **Gradle**: Project build management.

## How to Use
1.  **Java Examples**: Navigate to the `JavaProgramRunner` module. You can run individual classes with a `main` method (like `Q1_EvenOdd.java`) directly from your IDE.
2.  **Android App**: Sync the project with Gradle and run the `app` module on an emulator or a physical device.

## Recent Updates
*   Added comprehensive Java Stream API revision questions.
*   Implemented Observer and Strategy design patterns.
*   Added character frequency analysis tools.
