# Project Overview

This is a simple microservice built with Spring Boot that manages players and teams, using MongoDB as the data store.

# Exposed Operations

## Player Operations (`/jogador`)

*   **GET /jogador**
    *   Description: Retrieves a list of all players.
    *   Response: JSON array of player objects.

*   **POST /jogador**
    *   Description: Creates a new player.
    *   Request Body: JSON object representing the player. Example:
        ```json
        {
          "nome": "Player Name",
          "email": "player@example.com",
          "posicao": "Forward",
          "time": {
            "id": "team_id_if_exists"
          }
        }
        ```
    *   Response: JSON object of the created player.

## Team Operations (`/time`)

*   **GET /time**
    *   Description: Retrieves a list of all teams.
    *   Response: JSON array of team objects.

*   **POST /time**
    *   Description: Creates a new team.
    *   Request Body: JSON object representing the team. Example:
        ```json
        {
          "nome": "Team Name"
        }
        ```
    *   Response: JSON object of the created team.

# Dependencies

*   **Spring Boot:** Used for creating the web application, RESTful APIs, and managing dependencies.
    *   `spring-boot-starter-web`: For building web applications.
    *   `spring-boot-starter-data-rest`: For exposing REST endpoints.
    *   `spring-boot-starter-data-mongodb`: For MongoDB integration.
*   **MongoDB:** NoSQL database used for data storage.
*   **Lombok:** Java library to reduce boilerplate code.

# How to Run

1.  **Prerequisites:**
    *   Java 8 or higher installed.
    *   Maven installed.
    *   MongoDB instance running (or use the embedded version for testing).

2.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd <project-directory>
    ```

3.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on port `8081` by default.
