# Assignment 2: Vehicle Management System

## A. Project Overview

This project is a Vehicle Management System written in Java.
The purpose of this assignment is to practice Object-Oriented Programming concepts,
especially inheritance, abstraction, composition, and method overriding.

In this project, different types of vehicles such as cars, motorcycles, and trucks
are created using a common abstract superclass. Drivers are assigned to vehicles,
and the program demonstrates how polymorphism works when calling methods through
a superclass reference.

---

## B. Class Hierarchy

### Vehicle (Abstract Class)

`Vehicle` is an abstract superclass that contains common fields such as brand and year.
It also defines abstract methods like `startEngine()` and `stopEngine()` that must
be implemented by all subclasses.

The class also includes a concrete method `displayInfo()` that prints basic vehicle
information and driver details.

### Subclasses

- **Car**
- **Motorcycle**
- **Truck**

Each subclass extends `Vehicle` and provides its own implementation of
`startEngine()` and `stopEngine()`. This demonstrates method overriding
and polymorphism.

### Driver Class

The `Driver` class represents a driver with a name and license number.
Each vehicle has a driver assigned to it, which demonstrates composition.
One driver can be associated with multiple vehicles, showing aggregation.

---

## C. Instructions to Compile and Run

The project can be run using IDE.

1. Open the project folder in IDE.
2. Open `Main.java`.
3. Run the program.

You can also run the project using the command line:

```bash
javac *.java
java Main
```
---

## D. Screenshots and Reflection

Screenshots of the program output `docs/screenshots` folder.

### Reflection

While working on this assignment, I learned how inheritance helps reduce
code duplication by sharing common behavior in a superclass. Using abstract
classes made the design cleaner and easier to understand.
