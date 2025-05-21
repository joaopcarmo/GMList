# GMList

GMList is a RESTful API built with Java and Spring Boot to manage a collection of games. This project was created as part of Intensivão Java Spring, focusing on best practices, clean architecture, and database integration.

---

## Domain Model

![dslist-model](https://github.com/user-attachments/assets/78d7436f-c8ee-47d8-8cea-9d71da257611)

---

## Features

- **GET /games**: Returns a list of all games with summarized information (DTO).
- **GET /games/{id}**: Returns detailed information for a specific game.
- **GET /games/list/{listId}**: Returns all games belonging to a specific list.
- Organized architecture using DTOs, Repositories, Services, and Controllers.
- Initial seed data to populate the database with popular games.
- Persistence using JPA with an in-memory H2 database for development and testing.


---

## Technologies Used

- Java 17  
- Spring Boot
- JPA/Hibernate 
- H2 Database (in-memory)
- PostgreSql
- Maven  
- GitHub 
- Postman
---

## Project Structure

- **entities**: Classes representing database entities (Game)  
- **dto**: Data Transfer Objects for simplified data exposure (GameMinDto)
- **projections**: Interfaces used to define partial views of entities for optimized query results(e.g., GameMinProjection)
- **repositories**: Interfaces for data access (GameRepository)  
- **services**: Business logic and data manipulation (GameService)  
- **controllers**: REST API endpoints managing HTTP requests (GameController)  

---

## How to Run

1. Clone the repository:  
   `git clone https://github.com/joaopcarmo/GMList.git`  
   Then navigate to the project folder:  
   `cd GMList`

2. Build and run the application using Maven:  
   `./mvnw spring-boot:run`

3. Access the API at:  
   `http://localhost:8080/games`

4. Access the H2 database console at:  
   `http://localhost:8080/h2-console`  
   Use the following credentials:  
   - JDBC URL: `jdbc:h2:mem:testdb`  
   - User: `sa`  
   - Password: (leave blank)

---

## Next Steps

- Implement authentication and security  
- Add endpoints for creating, updating, and deleting games  
- Develop a frontend interface to consume the API  
- Improve API documentation with Swagger/OpenAPI  


## Contact

João Pedro Carmo  
Email: joaocarmolp@gmail.com  
GitHub: [joaopcarmo](https://github.com/joaopcarmo)<br>
Linkedin: [joaopcarmo](https://www.linkedin.com/in/joaopcarmo/)
