# Animal Class Example in Java

This Java program demonstrates key object-oriented programming (OOP) concepts: **Abstraction**, **Encapsulation**, **Inheritance**, and **Polymorphism**. The code models animals and their behaviors, using a class hierarchy with an abstract base class and concrete subclasses.

## Concepts Covered

### 1. **Abstract Class**
The `Animal` class is an abstract class, which means it cannot be instantiated directly. It provides a general template for subclasses. It includes:
- **Abstract methods**: These methods must be implemented by any concrete subclass (e.g., `makeSound()`).
- **Concrete methods**: These methods have a predefined implementation and can be used directly by subclasses (e.g., `eat()`).

### 2. **Encapsulation**
Encapsulation is implemented in the `Animal` class by making the `name` field private. This ensures that the field cannot be accessed directly from outside the class. Instead, a getter method `getName()` is used to provide controlled access to the `name` field.

### 3. **Inheritance**
The `Dog` and `Cat` classes inherit from the `Animal` class. Inheritance allows these classes to:
- Share common behavior from the `Animal` class.
- Override the abstract `makeSound()` method to provide specific implementations for dogs and cats.

### 4. **Polymorphism**
Polymorphism is demonstrated by using the same `Animal` type to reference both `Dog` and `Cat` objects. Despite the variable being of type `Animal`, the correct `makeSound()` method is called based on the actual object type (either `Dog` or `Cat`). This shows how polymorphism allows objects of different classes to be treated uniformly.
"# KeyIdeasObjectOrientedProgramming" 
