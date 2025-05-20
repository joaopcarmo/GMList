# GMList

GMList is a RESTful API built with Java and Spring Boot to manage a collection of games. This project was created as part of an intensive Java course, focusing on best practices, clean architecture, and database integration.

---

## Features

- Retrieve a list of all games with summarized information (DTO)
- Retrieve detailed information for each game
- Organized architecture with DTOs, Repositories, Services, and Controllers
- Initial seed data to populate the database with popular games
- Persistence using JPA and an H2 in-memory database for development and testing

---

## Technologies Used

- Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- H2 Database (in-memory)  
- Maven  
- GitHub for version control

---

## Project Structure

- **entities**: Classes representing database entities (Game)  
- **dto**: Data Transfer Objects for simplified data exposure (GameMinDto)  
- **repositories**: Interfaces for data access (GameRepository)  
- **services**: Business logic and data manipulation (GameService)  
- **controllers**: REST API endpoints (GameController)  

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

João Carmo  
Email: joaocarmolp@gmail.com  
GitHub: [joaopcarmo](https://github.com/joaopcarmo)
