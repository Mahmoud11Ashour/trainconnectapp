
# TrainConnect: Training Services System

TrainConnect is a microservices-based system designed to manage training opportunities for university students, companies, and university supervisors. The system facilitates student registration, company training listings, application tracking, notifications, and reporting — all through a scalable, distributed architecture using Spring Boot.

---

## Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Microservices Architecture](#microservices-architecture)
- [System Components](#system-components)
- [How to Run](#how-to-run)
- [API Endpoints](#api-endpoints)
- [Future Enhancements](#future-enhancements)

---

## Features

- Student registration and profile management
- Company registration and training opportunity posting
- Application management and status tracking
- JWT-based user authentication
- REST-based inter-service communication
- Notification service to send updates
- Reporting service for university supervisors
- Centralized config and dynamic discovery via Eureka

---

## Tech Stack

| Layer              | Technology                     |
|-------------------|--------------------------------|
| Backend           | Java 17, Spring Boot 3.5.3     |
| Microservices     | Spring Cloud (Eureka, Config)  |
| API Gateway       | Spring Cloud Gateway           |
| Authentication    | JWT (JSON Web Tokens)        |
| DB (per service)  | MySQL                          |
| Frontend (future) | React JS                       |
| DevTools          | Spring Boot DevTools, Feign    |

---

## Microservices Architecture

```
[Client] → [API Gateway] → [Microservices]
                       ↘︎ [Config Server]
                       ↘︎ [Eureka Discovery Server]
```

Each microservice is independently deployable and manages its own database.


## System Components

| Service              | Description |
|----------------------|-------------|
| `discoveryserver`    | Eureka Server for service registration and discovery |
| `configserver`       | Centralized configuration service using GitHub or local config |
| `apigateway`         | API Gateway to route external requests to internal microservices |
| `studentservice`     | Manages student registration and profiles |
| `applicationservice` | Handles student applications for training |
| `opportunityservice` | Allows companies to post training opportunities |
| `companyservice`     | Manages company accounts and listings |
| `authservice`        | Handles user registration, login, and JWT auth |
| `notificationservice`| Sends notifications by reading from other services |
| `reportservice`      | Generates summary reports for supervisors (future use) |

---

##  How to Run

### Prerequisites

- JDK 17+
- MySQL Server (Create required databases manually)
- Maven
- Spring Cloud-compatible Git configuration (or `application.yml`/`bootstrap.yml`)

### Start Order

1. `discoveryserver` – port `8761`
2. `configserver` – port `8888`
3. `apigateway` – port `8080`
4. Other microservices:
   - `studentservice` – port `8081`
   - `applicationservice` – port `8082`
   - `opportunityservice` – port `8083`
   - `companyservice` – port `8084`
   - `authservice` – port `8085`
   - `notificationservice` – port `8086`
   - `reportservice` – port `8087`

### Running via Maven

```bash
cd service-name
mvn spring-boot:run
```

---

## Example API Endpoints

| Endpoint | Method | Description |
|----------|--------|-------------|
| `/students` | GET | Fetch all students |
| `/applications` | POST | Submit a new application |
| `/auth/register` | POST | Register a new user |
| `/reports/summary` | GET | View system-wide report |

---

## Screenshots (Optional)

> You can include screenshots of Postman requests, database schema, or Eureka dashboard here.

---

## Future Enhancements

- Add frontend using React or Angular
- Implement email notifications
- Integrate with Firebase or Twilio for push alerts
- Export reports as PDF/Excel
- Add unit testing and CI/CD pipelines
- Dockerize the entire architecture

---

## Author

**Mahmoud M. Ashour**  
Graduate Student – Data Science  
Gaza, Palestine  
[GitHub Profile](https://github.com/Mahmoud11Ashour)

---

## License

This project is licensed for academic and educational purposes.
