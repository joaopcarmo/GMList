# GMList - Game List Management System

English | [Português](README.pt.md) 

GMList is a RESTful application developed with Spring Boot for managing game lists. The system allows cataloging games with details such as title, release year, genre, platforms, and rating, as well as organizing them into thematic lists.

## 📋 Features

- Complete game listing
- Game search by ID
- Creation and management of game lists
- Query games by specific list
- Organization of games in specific positions within lists

## 🛠️ Technologies Used

- **Spring Boot**: Java application development framework
- **Spring Data JPA**: For data persistence
- **Jakarta Persistence (JPA)**: Persistence API for object-relational mapping
- **RESTful API**: Architectural pattern for web APIs
- **PostgreSQL**: Relational database management system
- **Docker**: Platform for developing, shipping, and running applications in containers
- **Maven**: Build automation and dependency management tool
- **Postman**: Platform for API testing and documentation

## 🏗️ Architecture

The project follows a layered architecture:

### 📦 Entities
- `Game`: Represents a game with its attributes
- `GameList`: Represents a list of games
- `Belonging`: Represents the relationship between a game and a list, including the position of the game in the list
- `BelongingPK`: Composite primary key for the Belonging entity

### 🔄 DTOs (Data Transfer Objects)
- `GameDto`: Contains all game data
- `GameMinDto`: Simplified version of game data
- `GameListDto`: Game list data

### 📊 Projections
- `GameMinProjection`: Interface to project specific data in custom queries

### 🗄️ Repositories
- `GameRepository`: Interface for game persistence operations
- `GameListRepository`: Interface for game list persistence operations

### 🔧 Services
- `GameService`: Business logic related to games
- `GameListService`: Business logic related to game lists

### 🎮 Controllers
- `GameController`: API endpoints related to games
- `GameListController`: API endpoints related to game lists

## 🔌 API Endpoints

### Games

```
GET /games - Returns the list of all games (simplified version)
GET /games/{id} - Returns the complete details of a specific game
```

### Game Lists

```
GET /lists - Returns all game lists
GET /lists/{listId}/games - Returns all games belonging to a specific list
```

## 📚 Database Structure

The project uses three main tables:

- **tb_game**: Stores information about games
- **tb_game_list**: Stores game lists
- **tb_belonging**: Association table between games and lists, including positioning

## 🚀 How to Run the Project

1. Clone the repository
   ```bash
   git clone https://github.com/joaopcarmo/GMList.git
   ```

2. Enter the project folder
   ```bash
   cd GMList
   ```

3. Run the project using Maven
   ```bash
   ./mvnw spring-boot:run
   ```

4. The API will be available at `http://localhost:8080`

## 💡 Next Steps

- Implementation of create, update, and delete operations (full CRUD)
- User authentication and authorization
- API documentation with Swagger
- Implementation of automated tests
- Frontend for API consumption

## 📄 License

This project is licensed under the [MIT](LICENSE) license.

## 📞 Contact

- **GitHub**: [joaopcarmo](https://github.com/joaopcarmo)
- **LinkedIn**: [João Pedro Carmo](https://linkedin.com/in/joaopcarmo)
- **Email**: joaocarmolp@gmail.com

  ## 👨‍💻 Author

- [João P. Carmo](https://github.com/joaopcarmo)
