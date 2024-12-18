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

Solution:

To address the problem where directly modifying a class can introduce bugs or break existing functionality, apply the Open/Closed Principle (OCP). This principle states
that classes should be open for extension but closed for modification.

# 3. Liskov Substitution Principle (LSP)
Definition:
Subclasses must be substitutable for their superclasses without breaking the program's behavior.

Encountered Problem:
When subclasses alter the expected behavior, it can lead to unpredictable bugs.

Solution:

To address the problem of subclasses altering the expected behavior and causing unpredictable bugs, apply the Liskov Substitution Principle (LSP). This principle ensures that subclasses can 
be used interchangeably with their base class without altering the correctness of the program.

# 4. Interface Segregation Principle (ISP)
Definition:
A class should not be forced to implement interfaces it does not use.

Encountered Problem:
"Overly large" interfaces force classes to implement unused methods.

Solution:

To address the problem of "overly large" interfaces forcing classes to implement unused methods, apply the Interface Segregation Principle (ISP). This principle states that no client should be forced to depend on methods it does not use.

# 5. Dependency Inversion Principle (DIP)
Definition:
High-level modules should not depend on low-level modules. Both should depend on abstractions.

Encountered Problem:
A strong coupling between modules makes modifications and testing difficult.

Solution:

To address the problem of strong coupling between modules that makes modifications and testing difficult, apply the Dependency Inversion Principle (DIP). This principle states that:

 1-High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).
 2-Abstractions should not depend on details. Details (implementations) should depend on abstractions.
