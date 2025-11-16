# 📚 Library Management System (Java OOP – CLI)

A simple yet practical **Library Management System** built using **Java** and core **Object-Oriented Programming (OOP)** principles.  
This is a **command-line application** that simulates basic library operations such as adding books, registering members, issuing books, and returning them.

---

## ✨ Features

- 📘 **Add new books** to the library
- 👤 **Register new members**
- 📋 **View all books** in the library (with availability status)
- 📖 **Issue books** to registered members
- 📤 **Return issued books**
- 🧾 **View issued books** and who they are issued to (if implemented)
- ⚙️ **Menu-driven CLI interface** for easy navigation

---

## 🧠 Concepts & Technologies

### 🛠️ Technologies Used
- **Java (JDK 8+)**
- **Standard Java Collections** (`ArrayList`)
- **CLI (Command-Line Interface)**

> You can use any IDE or editor (IntelliJ IDEA, VS Code, Eclipse, Geany, etc.) to run the project.

### 💡 OOP Concepts Practiced

- **Classes & Objects** – `Book`, `Member`, `Library`, `LibraryManagementSystem`
- **Encapsulation** – private fields with getters/setters
- **Constructors** – initializing objects with specific data
- **Method Overloading** (if used)
- **Composition** – `Library` managing `Book` and `Member` collections
- **Separation of Concerns** – keeping logic organized by responsibility

---

## 📂 Project Structure

```text
src/
├── LibraryManagementSystem.java   # Main class (entry point + menu handling)
├── Library.java                   # Core logic: manage books & members
├── Book.java                      # Book entity (id, title, author, status)
└── Member.java                    # Member entity (id, name, issued books, etc.)
```

> Your actual folder structure may differ slightly (e.g., package names), but the core classes remain similar.

---

## ▶️ How to Run the Project

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/library-management-system-java.git
cd library-management-system-java
```

> Replace `YOUR-USERNAME` with your actual GitHub username.

### 2️⃣ Compile the Source Code

If all `.java` files are in the root folder:

```bash
javac *.java
```

Or, if they are inside `src/` and use no packages:

```bash
cd src
javac *.java
```

### 3️⃣ Run the Application

```bash
java LibraryManagementSystem
```

You’ll then see a menu similar to:

```text
===== Library Management System =====
1. Add Book
2. Add Member
3. View All Books
4. Issue Book
5. Return Book
6. Exit
Enter your choice:
```

Follow the prompts to perform operations.

---

## 🧪 Example Use Cases

- Add several books (e.g., "Clean Code", "Effective Java").
- Register members (e.g., "Alice", "Bob").
- Issue a book from the library to a registered member.
- Return the book and verify that the status changes back to "Available".
- View the book list to check current availability and issued status.

---

## 🔮 Possible Future Enhancements

- 🔍 **Search functionality**
  - Search books by title, author, or ID
  - Search members by name or ID
- 💾 **Persistent storage**
  - Store data in files (text/JSON/CSV) or a relational database (MySQL, PostgreSQL)
- 🔐 **User authentication**
  - Admin / Librarian login system
- ⚠️ **Improved error & exception handling**
  - Input validation and custom exceptions
- 🌐 **Upgrade to GUI / Web**
  - JavaFX / Swing GUI
  - Spring Boot REST API + frontend client

---

## 📦 Requirements

- **Java Development Kit (JDK) 8 or higher**
- A terminal / command prompt
- (Optional) An IDE like:
  - IntelliJ IDEA
  - Eclipse
  - VS Code
  - Geany

---

## 👨‍💻 Author

- **Dinushka Tharidu**  
  📧 [asdinushkatharidu@gmail.com](mailto:asdinushkatharidu@gmail.com)  
  🔗 [LinkedIn](https://www.linkedin.com/in/dinushka-tharidu)

---

## 🤝 Contributing

Contributions, suggestions, and improvements are welcome!

1. **Fork** the repository
2. Create a new branch: `feature/my-new-feature`
3. Commit your changes
4. Open a **Pull Request**

If you find this project helpful, consider giving it a **⭐ star** on GitHub!

---

## 🏷️ Tags

`#Java` `#OOP` `#LibraryManagementSystem` `#CLI` `#Programming` `#BeginnerFriendly`
