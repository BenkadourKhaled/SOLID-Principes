# SOLID-Principes
The SOLID principles are guidelines for writing clean, maintainable, and extensible code. Below is a summary of the five principles with explanations, potential issues, and concrete examples in Java

# 1. Single Responsibility Principle (SRP)
The class should solve only one problem it should have a single reason to change, ‘do one thing and do it well’, a class should have one and only one reason to change, meaning that a class should have only one job.

Encountered Problem:
When a class has multiple responsibilities, it becomes complex and difficult to maintain. A change in one responsibility can impact the other.

Solution:

To address the problem of a class having multiple responsibilities, apply the Single Responsibility Principle (SRP) by splitting the class into smaller, focused classes, each with a single responsibility. This ensures that:

    1- Separation of Concerns: Each class handles one responsibility, reducing interdependence.
    2- Ease of Maintenance: Changes to one responsibility do not affect others.
    3- Reusability: Classes with well-defined responsibilities are easier to reuse in other contexts.

# 2. Open/Closed Principle (OCP)
Definition:
A class should be open for extension but closed for modification.

Encountered Problem:
If a class is modified directly, it can introduce bugs and break existing functionalities.

# 3. Liskov Substitution Principle (LSP)
Definition:
Subclasses must be substitutable for their superclasses without breaking the program's behavior.

Encountered Problem:
When subclasses alter the expected behavior, it can lead to unpredictable bugs.

# 4. Interface Segregation Principle (ISP)
Definition:
A class should not be forced to implement interfaces it does not use.

Encountered Problem:
"Overly large" interfaces force classes to implement unused methods.

# 5. Dependency Inversion Principle (DIP)
Definition:
High-level modules should not depend on low-level modules. Both should depend on abstractions.

Encountered Problem:
A strong coupling between modules makes modifications and testing difficult.
