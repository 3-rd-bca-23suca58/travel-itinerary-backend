# 📁 BACKEND – `smart-itinerary-backend/README.md`

```md
# Smart Travel Itinerary Planner – Backend

This is the **backend** of the Smart Travel Itinerary Planner application, developed using **Spring Boot**.  
It provides REST APIs for managing travel itineraries.

---

## 🚀 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL / H2 Database
- Maven

---

## 📌 Features

- Create itinerary
- Read all itineraries
- Update itinerary
- Delete itinerary
- RESTful API design

---

## 📂 Entity

### Itinerary
| Field | Type |
|-----|------|
| id | Long |
| name | String |
| location | String |
| startDate | LocalDate |
| endDate | LocalDate |

---

## 📂 API Endpoints

Base URL:
http://localhost:8080/api/itineraries

yaml
Copy code

| Method | Endpoint | Description |
|------|--------|------------|
| POST | / | Add itinerary |
| GET | / | Get all itineraries |
| PUT | /{id} | Update itinerary |
| DELETE | /{id} | Delete itinerary |

---

## ⚙️ Setup & Run

### 1️⃣ Open project in IntelliJ
### 2️⃣ Configure Java 17
### 3️⃣ Run application
```bash
mvn spring-boot:run
🔓 CORS Configuration (Important)
java
Copy code
@CrossOrigin(origins = "http://localhost:3000")
🗄️ Database Configuration
Example (H2 / MySQL in application.properties):

properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Development branch for ongoing backend features.
