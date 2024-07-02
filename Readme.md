## Tutorial Management Project Description

A client has requested a demo of a tutorial management system. In the future, this system will allow users to upload and view tutorials similar to Udemy, as well as edit or delete tutorials.

## Table of Contents

- [Project Objectives](#project-objectives)
- [Project Description](#project-description)
- [Implementation Details](#implementation-details)
- [Implemented Technologies](#implemented-technologies)
- [Action Plan](#action-plan)

### Project Objectives:

1. Reinforce object-oriented programming concepts for students.
2. Apply principles of inheritance, the MVC (Model-View-Controller) pattern, Dependency Injection, and encapsulation to hide the internal implementation of classes and protect data.
3. Utilize SOLID principles to create a robust and maintainable system.

### Project Description:
The objective of this project is to develop a tutorial management system in Java with a MySQL database. The system will allow users to perform the following actions:

- View a list of tutorials.
- Add new tutorials to the database.
- Delete existing tutorials from the database.
- Edit the information of an existing tutorial.

### Implementation Details:

1. System Architecture:
   The system will follow an MVC (Model-View-Controller) architecture and will implement the following main components:

- Model: Will contain the classes that represent the data and business logic.
- View: Will manage the presentation of data to the user.
- Controller: Will act as an intermediary between the Model and the View, handling user requests and updating the view as necessary.

2. System Components:
a. Model:
   - Tutorial: A class representing a tutorial with attributes such as id, title, description, author, and duration.
b. View:
   - User Interface (UI): Could be a console application or a simple graphical interface (GUI) for the initial demo.
c. Controller:
   - TutorialController: A class that handles user requests and coordinates actions between the view and the model.

3. MySQL Database:
   A MySQL database will be created with a “Tutorials” table that will contain the tutorial information.

4. SOLID Principles:

- Single Responsibility Principle (SRP): Each class will have a single responsibility.
- Open/Closed Principle (OCP): The system will allow for extension without modifying existing code.
- Liskov Substitution Principle (LSP): Derived classes can be substituted for their base classes without altering functionality.
- Interface Segregation Principle (ISP): Specific interfaces will be created for each set of functionalities.
- Dependency Inversion Principle (DIP): High-level modules will not depend on low-level modules. Both will depend on abstractions.


### Implemented Technologies:

Java: For developing the core application.
MySQL: For the database.
Spring Framework: For implementing MVC architecture, Dependency Injection, and other enterprise-level features.
Hibernate: For Object-Relational Mapping (ORM) with the MySQL database.
Maven: For project build and dependency management.
*[JUnit: For testing the application components.](https://www.javaguides.net/2022/03/spring-boot-unit-testing-crud-rest-api-with-junit-and-mockito.html)
 

### Action Plan:

1. Database Design: Create the database and the Tutorials table.
2. Model Development: Implement the Tutorial classes.
3. View Development: Implement the user interface (TutorialServices).
4. Controller Development: Implement the TutorialController class.
5. Integration and Testing: Integrate all components and perform tests to ensure system functionality.
6. Documentation and Demo: Prepare documentation and a functional demo for the client.