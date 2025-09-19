<p align="center">
  <img src="https://img.icons8.com/color/96/000000/student-male--v2.png" alt="Student Icon"/>
</p>

<h1 align="center">Student Management System (JDBC)</h1>

<p align="center">
  📚 A simple Java-based student management system using JDBC to perform CRUD operations.
  <br/>
  <a href="https://github.com/sumitojha2002/student-management-jdbc">🔗 View on GitHub</a>
</p>

---

## 🛠️ Table of Contents

- [🎯 About the Project](#-about-the-project)  
- [🔑 Features](#-features)  
- [⚙️ Getting Started](#️-getting-started)  
  - [📋 Prerequisites](#-prerequisites)  
  - [📦 Installation](#-installation)  
- [🧰 Usage](#-usage)  
- [📂 Project Structure](#-project-structure)  
- [🧮 Technologies Used](#-technologies-used)  
- [🤝 Contributing](#-contributing)  
- [📝 License](#-license)  
- [👤 Contact](#-contact)

---

## 🎯 About the Project

This is a command-line Java application designed to manage student data using JDBC. It allows users to:

- Add new students
- View all or specific student details
- Update student records
- Delete student entries

It’s a great practice project for learning JDBC, Java, and basic database interactions.

---

## 🔑 Features

| Feature | Description |
|--------|-------------|
| ➕ **Add Student** | Insert new student records into the database |
| 🔍 **View Students** | Retrieve and display student records |
| ✏️ **Update Student** | Edit existing student details |
| ❌ **Delete Student** | Remove student records by ID |
| 🗄️ **JDBC Integration** | Seamless database connectivity using JDBC |
| 🧹 **Clean Code** | Organized structure following OOP principles |

---

## ⚙️ Getting Started

### 📋 Prerequisites

Ensure you have the following installed:

- ✅ Java JDK 8 or higher  
- ✅ Maven  
- ✅ MySQL or compatible RDBMS  
- ✅ IDE (IntelliJ, Eclipse, VSCode, etc.)

### 📦 Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/sumitojha2002/student-management-jdbc.git
   cd student-management-jdbc
   
2. **Configure Database**

Update DB credentials in your code (likely in a `DBConnection` or config class):

```java
String url = "jdbc:mysql://localhost:3306/your_db";
String user = "your_username";
String password = "your_password";
```

3. **Build the Project**

```bash
nvm clean install
```

4. **Run the App**

```bash
java -cp target/student-management-jdbc-1.0-SNAPSHOT.jar Main
```
### 🧰 Usage

When you run the app,you'll see a menu like:

Welcome to Student Management System
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice:

### 📂 Project Structure ###
```bash
student-management-jdbc/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── studentmgmt/
│       │           ├── dao/          # Data Access Objects
│       │           ├── model/        # POJOs like Student.java
│       │           ├── service/      # Business Logic
│       │           └── Main.java     # Entry Point
│       └── resources/
│           └── application.properties (optional)
├── pom.xml
└── README.md
```
### 🧮 Technologies Used ###

- ☕ Java 8+ – Core programming language
- 🧩 JDBC – For database connectivity
- 🐬 MySQL – Relational database
- 📦 Maven – Build automation tool
- 🧠 OOP – Object-oriented design

### 🤝 Contributing ###

Contributions are welcome!
1. 🍴 Fork the repo
2. 🛠️ Create a feature branch
   ```bash
   git checkout -b feature-name
   ```
3. 💾 Commit your changes
   ```bash
   git commit -m 'Add new feature'
   ```
4. 📨 Open a Pull Request
   Please ensure your code follows best practices and includes necessary documentation/comments.

---
### 📝 License ###

This project is licensed under the MIT License.

---
### 👤 Contact ###

Sumit Ojha

📧 ojha61863@gmail.com

---
<p align="center"><strong>⭐️ Star this repo if you found it useful!</strong></p> 
