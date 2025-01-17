# Student Project

## Overview

This Spring Boot application manages a simple student-subject relationship. It allows you to perform CRUD operations on students and subjects. The application uses JPA for data persistence and includes basic RESTful APIs to interact with the data.

## Features

- **Student Management**: Create, read.
- **Subject Management**: Create, read.
- **Many-to-Many Relationship**: Manage the relationship between students and subjects.
- **Security**: Basic authentication with roles for Admin and User.
- 
## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (or any other JPA-compatible database)
- Spring Security

## Prerequisites

- Java 11 or higher
- Maven (for building the project)

## Setup and Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/your-username/student-project.git
   cd student-project
2. **Build the Project**
   Use Maven to build the project and resolve dependencies.
    ```bash
    mvn clean install
 3. **Run the Application**
    Start the application using Maven.
     ```bash
    mvn spring-boot:run
Alternatively, you can run the application from the generated JAR file.

  **java -jar target/student-project-0.0.1-SNAPSHOT.jar**

4. **Access the API**
   The application runs on http://localhost:8080 by default.

## Student Endpoints

POST /student/save - Create or update a student record.

GET /student/getall - Retrieve a list of all students.

Subject Endpoints

POST /subject/save - Create or update a subject record.
GET /subject/getall - Retrieve a list of all subjects.

## Database Configuration
By default, the application uses an in-memory H2 database. You can configure another database by modifying application.properties or application.yml in the src/main/resources directory.

Example configuration for an H2 database:
- spring.datasource.url=jdbc:h2:mem:testdb
- spring.datasource.driver-class-name=org.h2.Driver
- spring.datasource.username=sa
- spring.datasource.password=password
- spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

## Security
- The application uses Spring Security for basic authentication. There are two roles configured:

- ADMIN: Can access all endpoints.
- USER: Can only access /student/save.
- Default Users
  
 **Admin User:**

- Username: admin
- Password: adminpass
- Roles: ADMIN
- curl -u admin:adminpass http://localhost:8080/student/getall


**Regular User:**

- Username: user
- Password: userpass
- Roles: USER
- curl -u user:userpass -X POST -H "Content-Type: application/json" -H "X-CSRF-TOKEN: csrfToken" -d '{"name": "John Doe", "address": "123 Main St", "subjects": []}' http://localhost:8080/student/save

