# To-Do List Application

This is a simple To-Do List web application built using Java Spring Boot. It allows users to manage tasks, including adding, viewing, updating, and deleting tasks. The application demonstrates basic CRUD (Create, Read, Update, Delete) operations with a simple REST API.

## Features
- Create a new task.
- View all tasks or a specific task by its ID.
- Update an existing task's details.
- Delete a task by its ID.
- Filter tasks by status (PENDING, IN_PROGRESS, COMPLETED).
- Input validation for tasks (e.g., required fields, valid dates).

## Technologies Used

- Backend:
  - Java 11 or higher
  - Spring Boot 2.x
  - Spring Data JPA (with H2 in-memory database)
  - Hibernate Validator (for validation)
  - RESTful API
- Tools:
  - Maven (for build management)
  - Postman or cURL (for API testing)
  
---

## Getting Started

**Prerequisites**

- Java 11 or higher installed.
- Maven installed (if using Maven for dependency management).
- Git installed.

## Clone the Repository
```bash
git clone https://github.com/your-username/todo-list-app.git
cd todo-list-app
```
## Running the Application

1. Build the project with Maven:
    ```bash
   mvn clean install
   ```
2. Run the application using the Spring Boot Maven plugin:

```bash
mvn spring-boot:run
```

3. The application will start on http://localhost:8080.
---

## API Endpoints

## Base URL

```bash
http://localhost:8080
```

## Task Endpoints:

### Get All Tasks
- Endpoint: `GET /tasks`
- Description: Retrieve all tasks.
- Example Response:

```json
[
  {
    "id": 1,
    "title": "Complete Project Report",
    "description": "Submit the project report by Friday.",
    "status": "IN_PROGRESS",
    "dueDate": "2023-10-15"
  }
]
```
### Get Task by ID

- Endpoint: `GET /tasks/{id}`

- Description: Retrieve a task by its ID.

- Example:

```bash
GET /tasks/1
```

### Create a New Task

- Endpoint: `POST /tasks`

- Description: Create a new task.

- Example Request:

```json
{
  "title": "Design New Logo",
  "description": "Create several logo concepts for review.",
  "status": "PENDING",
  "dueDate": "2023-11-15"
}

```
### Update a Task

- Endpoint: `PUT /tasks/{id}`

- Description: Update an existing task.

- Example Request:

```json
{
  "title": "Design New Logo",
  "description": "Finalize the logo design.",
  "status": "IN_PROGRESS",
  "dueDate": "2023-11-20"
}
```
### Delete a Task

- Endpoint: `DELETE /tasks/{id}`

- Description: Delete a task by its ID.

- Example:

```bash
DELETE /tasks/1
```
### Get Tasks by Status

- Endpoint: `GET /tasks/status/{status}`

- Description: Retrieve tasks by their status.

- Example:

```bash
GET /tasks/status/PENDING
```
---

### Data Validation

This project uses Hibernate Validator to ensure data integrity:

- Title: Must not be empty.
- Due Date: Must be today or a future date.
- Status: Must not be null and must be one of `PENDING`, `IN_PROGRESS`, or `COMPLETED`.

### Testing

You can test the API using Postman, cURL, or a similar tool. Below are some sample cURL commands:

- Get all tasks:
```bash
curl -X GET http://localhost:8080/tasks
```
- Create a new task:
```bash
curl -X POST -H "Content-Type: application/json" -d '{
  "title": "Write README.md",
  "description": "Create a README file for the project.",
  "status": "PENDING",
  "dueDate": "2023-10-01"
}' http://localhost:8080/tasks
```
- Update a task:

```bash
curl -X PUT -H "Content-Type: application/json" -d '{
  "title": "Write README.md",
  "description": "Update the README with final details.",
  "status": "IN_PROGRESS",
  "dueDate": "2023-10-05"
}' http://localhost:8080/tasks/1
```
- Delete a task:
```bash
curl -X DELETE http://localhost:8080/tasks/1
```
---
## Project Structure

```bash
src
 ├── main
 │   ├── java
 │   │   └── com.example.todo
 │   │        ├── model         # Contains Task entity
 │   │        ├── repository    # Contains TaskRepository
 │   │        ├── controller    # Contains TaskController (API endpoints)
 │   │        └── exception     # Custom exceptions and global exception handler
 │   └── resources
 │        ├── application.properties  # Configuration for the Spring Boot application
 │        └── data.sql                 # Optional: SQL for initializing data
 └── test
      └── java
           └── com.AshkanAmin.simple.To_Do_list.Application  
```
---
## Database Configuration
The project uses an H2 in-memory database, which means data will be lost when the application is restarted. You can access the H2 console by navigating to `http://localhost:8080/h2-console` in your browser.

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

You can customize the database settings in the `application.properties` file.

---

## Further Improvements

- Authentication: Add user authentication using Spring Security.
- Pagination and Sorting: Implement pagination and sorting for task retrieval.
- Deployment: Deploy the application on Heroku, AWS, or another cloud provider.

---

## Contact

For questions or support, please contact:

- Name: SeyedMohammad
- Email: a.amin771116@yahoo.com
- GitHub: [SeyedMohammad](https://github.com/SeyedMohommad)