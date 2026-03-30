Employee Management System (Java + JDBC + PostgreSQL)
Overview

This project is a console-based Employee Management System developed using Core Java and JDBC, integrated with a PostgreSQL database. The application is designed to perform basic database operations such as inserting and retrieving employee records. It demonstrates how a Java application can interact with a relational database using JDBC.

Features

The system currently supports adding new employee records and viewing existing employee data stored in the database. It uses PreparedStatement to ensure secure and efficient execution of SQL queries. The code is structured in a modular way to separate database connection, data access logic, and application execution.

Tech Stack

The project is built using Core Java as the programming language, JDBC API for database connectivity, and PostgreSQL as the relational database management system. The development environment used is Visual Studio Code.

Project Structure

The project is organized into multiple classes to maintain separation of concerns. The DBConnection class is responsible for establishing a connection with the PostgreSQL database. The EmployeeDAO class contains methods to perform database operations such as inserting and retrieving employee data. The Main class acts as the entry point of the application and controls the program flow. The PostgreSQL JDBC driver is stored in the lib folder.

How It Works

The execution starts from the Main class, which invokes methods from the EmployeeDAO class. The EmployeeDAO class interacts with the DBConnection class to establish a database connection using DriverManager. SQL queries are executed using PreparedStatement to ensure safety and efficiency. For retrieving data, ResultSet is used to process the query results.

Database Setup

To run this project, a PostgreSQL database needs to be created. First, create a database named "company". Then create a table named "employee" with fields such as id, name, and salary. The id field should be set as the primary key and configured to auto-increment.

JDBC Configuration

The database connection details such as URL, username, and password must be updated in the DBConnection class. The JDBC URL should follow the format "jdbc:postgresql://localhost:5432/company" along with the correct database credentials.

How to Run

To run the project, compile all Java files along with the PostgreSQL JDBC driver using the appropriate classpath configuration. After successful compilation, execute the Main class using the same classpath setup to establish the connection and perform operations.

Challenges Faced

During the development of this project, issues were encountered related to JDBC driver configuration and classpath setup. Errors such as ClassNotFoundException and No suitable driver found were resolved by correctly adding the PostgreSQL driver and ensuring it was properly referenced during compilation and execution.

Learning Outcomes

This project provided practical understanding of JDBC architecture, database connectivity, execution of SQL queries, and proper structuring of backend applications in Java. It also helped in understanding how real-world applications interact with databases.

Future Enhancements

The project can be further enhanced by adding update and delete functionalities, implementing a menu-driven interface, and eventually converting it into a web-based application using frameworks such as Spring Boot.
