# Assignment 5 — Strategy Design Pattern

**Student:** Saparova Mereylim  
**Course:** Software Design Patterns  
**University:** Astana IT University  
**Language:** Java 17

## 1. Project Overview

This project demonstrates the Strategy Design Pattern using a simple calculator application.

The calculator supports three mathematical operations: addition, subtraction, and multiplication.

The Strategy Pattern allows the calculator to switch between different algorithms at runtime without modifying the Calculator class.

## 2. Project Structure

- `OperationStrategy.java` — Strategy interface
- `AddStrategy.java` — Addition algorithm
- `SubtractStrategy.java` — Subtraction algorithm
- `MultiplyStrategy.java` — Multiplication algorithm
- `Calculator.java` — Context class
- `Main.java` — Client and demonstration

## 3. Strategy Pattern Components

**Strategy Interface:** `OperationStrategy` declares the common `execute()` method.

**Concrete Strategies:** `AddStrategy`, `SubtractStrategy`, and `MultiplyStrategy` implement different mathematical operations.

**Context:** `Calculator` maintains a reference to `OperationStrategy` and allows strategies to be changed using `setStrategy()`.

**Client:** `Main` creates the strategies and demonstrates runtime switching.

## 4. How to Run

1. Open the project in IntelliJ IDEA.
2. Configure Java JDK 17.
3. Open `Main.java`.
4. Run the `main()` method.

## 5. Expected Output

```text
Strategy Pattern Demo
---------------------
Addition:
10.0 + 5.0 = 15.0

Subtraction:
10.0 - 5.0 = 5.0

Multiplication:
10.0 * 5.0 = 50.0

Strategy changed successfully!
```

## 6. Clean Code Principles

The project demonstrates:

1. **Meaningful Names:** Classes and methods clearly describe their responsibilities.
2. **Single Responsibility Principle:** Each strategy implements only one mathematical operation.
3. **Polymorphism:** Different algorithms share the same interface.
4. **Open/Closed Principle:** New operations can be added without modifying the existing Calculator class.
5. **Encapsulation:** The Calculator keeps its strategy reference private.

## 7. UML Diagram

The UML class diagram demonstrates the relationships between the Strategy interface, concrete strategies, Context, and Client.

## 8. Conclusion

The Strategy Pattern makes the calculator flexible, maintainable, and extensible.

It allows algorithms to be changed dynamically without complex conditional statements.

The main trade-off is the additional number of classes required to represent separate strategies.
