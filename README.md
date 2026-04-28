# Student-Login-System-Project
java complete project step by step using  JSP + Servlet + JDBC + MySQL Database
# 🎓 Student Login System (JSP + Servlet + JDBC)

## 📌 Overview

This is a simple Java web application that demonstrates a **Login System** using:

* JSP (Frontend)
* Servlet (Controller)
* JDBC (Database Connectivity)
* MySQL (Database)

---

## 🛠️ Technologies Used

* Java
* JSP & Servlet
* JDBC
* MySQL
* Apache Tomcat

---

## 📂 Project Structure

* **model/** → JavaBeans (User class)
* **dao/** → Database logic (UserDAO)
* **servlet/** → Controller (LoginServlet)
* **WebContent/** → JSP pages
* **WEB-INF/** → Configuration files

---

## ⚙️ Setup Instructions

1. Install Java JDK
2. Install Apache Tomcat Server
3. Install MySQL Database
4. Import project into Eclipse
5. Add MySQL Connector JAR in `WEB-INF/lib`
6. Run `schema.sql` in MySQL
7. Start Tomcat Server

---

## ▶️ How It Works

1. User enters login details in `login.jsp`
2. Request is sent to `LoginServlet`
3. Servlet calls `UserDAO`
4. DAO connects to MySQL using JDBC
5. If valid → `success.jsp`
6. If invalid → `error.jsp`

---

## 🎯 Features

* Simple Login Authentication
* MVC Architecture
* Database Connectivity using JDBC

---

## 🚀 Future Improvements

* Add Registration Page
* Password Encryption
* Session Management
* CRUD Operations

---

## 👨‍💻 Author

kushagra jain

