# 📚 Library Management REST API

## 🚀 Project Overview

This project is a RESTful API built using Spring Boot to manage a library system. It allows users to perform CRUD (Create, Read, Update, Delete) operations on books.

---

## 🛠 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* Maven

---

## 📌 Features

* Add a new book
* View all books
* Update book details
* Delete a book

---

## 🔗 API Endpoints

| Method | Endpoint    | Description   |
| ------ | ----------- | ------------- |
| POST   | /books      | Add a book    |
| GET    | /books      | Get all books |
| PUT    | /books/{id} | Update book   |
| DELETE | /books/{id} | Delete book   |

---

## ▶️ How to Run the Project

1. Clone the repository
2. Open in Eclipse or any IDE
3. Run the main class (`LibraryapiApplication.java`)
4. Server will start on:
   http://localhost:8080

---

## 🧪 Testing

Use Postman to test API endpoints.

Example JSON for POST request:

```json
{
  "id": 1,
  "title": "Java Basics",
  "author": "Hemanth"
}
```

---

## 📂 Project Structure

* controller → Handles API requests
* model → Represents data (Book)
* repository → Handles database operations

---

## 🎯 Conclusion

This project demonstrates how to build a simple REST API using Spring Boot with database integration and CRUD functionality.

---

## 👨‍💻 Author

**Hemanth Kumar**
