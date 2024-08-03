Student Project
Overview
This Spring Boot application manages a simple student-subject relationship. It allows you to perform CRUD operations on students and subjects. The application uses JPA for data persistence and includes basic RESTful APIs to interact with the data.

Features
Student Management: Create, read.
Subject Management: Create, read.
Many-to-Many Relationship: Manage the relationship between students and subjects.
Technologies Used
Spring Boot
Spring Data JPA
H2 Database (or any other JPA-compatible database)
Prerequisites
Java 11 or higher
Maven (for building the project)
Setup and Installation
Clone the Repository

bash
Copy code
git clone https://github.com/your-username/student-project.git
cd student-project
Build the Project

Use Maven to build the project and resolve dependencies.

bash
Copy code
mvn clean install
Run the Application

Start the application using Maven.

bash
Copy code
mvn spring-boot:run

bash
Copy code
java -jar target/student-project-0.0.1-SNAPSHOT.jar
Access the API

The application runs on http://localhost:8080 by default.

Student Endpoints

POST /student/save - Create or update a student record.
GET /student/getall - Retrieve a list of all students.
Subject Endpoints

POST /subject/save - Create or update a subject record.
GET /subject/getall - Retrieve a list of all subjects.

Database Configuration
By default, the application uses an in-memory H2 database. You can configure another database by modifying application.properties or application.yml in the src/main/resources directory.

Example configuration for an H2 database:

properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect.
