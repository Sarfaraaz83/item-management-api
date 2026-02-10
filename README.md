# Item Management REST API

A simple Java Spring Boot backend application that exposes a RESTful API for managing a collection of items.  
This project demonstrates clean backend architecture, REST principles, input validation, and cloud deployment.

The application is deployed and publicly accessible.

---

## 🔗 Live Application URL

Base URL:
https://item-management-api-production-aed2.up.railway.app


---

## 🧩 Problem Statement

Build a backend REST API that:
- Manages a collection of items
- Allows adding a new item
- Allows fetching an item by its ID
- Uses in-memory storage
- Validates input data
- Is deployable and accessible via a public URL

This project fulfills **all** the above requirements.

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Maven
- REST API (JSON)
- In-memory storage (ArrayList)
- Railway (deployment)

---

## 🏗 Application Architecture

The application follows a clean layered architecture:

Controller → Service → Repository → In-Memory Storage


### Layers Explained
- **Controller**: Exposes REST endpoints and handles HTTP requests/responses
- **Service**: Contains business logic and input validation
- **Repository**: Manages in-memory data storage using ArrayList
- **Model**: Represents the Item entity

---

## 📦 Item Model

Each item contains the following fields:

| Field | Type | Description |
|------|------|-------------|
| id | Long | Auto-generated unique identifier |
| name | String | Item name (required) |
| description | String | Item description (required) |
| price | double | Item price |

---

## 🚀 API Endpoints

### 1️⃣ Add a New Item

**Endpoint**

POST /items

Example:
**POST https://item-management-api-production-aed2.up.railway.app/items**


**Description**  
Adds a new item to the system after validating input data.

**Request Body (JSON)**
```json
{
  "name": "MacBook Air",
  "description": "Apple laptop",
  "price": 99999
}
```
Successful Response

Status: 201 Created

Validation Rules

name must not be null or empty

description must not be null or empty

If validation fails:

Status: 400 Bad Request

Error message is returned

---

2️⃣ Get Item by ID

Endpoint

**GET /items/{id}**

Description
Fetches a single item using its unique ID.

Example Request

**GET https://item-management-api-production-aed2.up.railway.app/items/1**

Successful Response

Status: 200 OK

{
  "id": 1,
  "name": "MacBook Air",
  "description": "Apple laptop",
  "price": 99999
}

If Item Not Found

Status: 404 Not Found

Error message is returned

## ❌ Unsupported Endpoints (By Design)

The following endpoints are intentionally not exposed to maintain REST correctness:

- `GET /items`
- `PUT /items`
- `DELETE /items`

Attempting to call these endpoints will return:

405 Method Not Allowed


This is expected and correct REST behavior.

---

## 🧪 How to Test the API

### Tools
- Postman (recommended)
- curl
- Browser (for GET requests only)

### Example Workflow
1. Send `POST /items` to create an item
2. Copy the returned `id`
3. Send `GET /items/{id}` to fetch the item

---

## ⚠ Notes & Limitations

- Data is stored in memory using an `ArrayList`
- Data is lost when the application restarts
- No database is used (as per problem requirements)
- This is a backend-only application (no UI)

---

## ▶ Run Locally

### Prerequisites
- Java 17+
- Maven

### Command
```bash
mvn spring-boot:run
```
Application runs at:

http://localhost:8080

## 👤 Author

**Sarfaraaz Ahmed**

---

## ✅ Conclusion

This project demonstrates:
- RESTful API design
- Clean backend architecture
- Proper HTTP method usage
- Input validation
- Cloud deployment
- Real-world backend development practices



