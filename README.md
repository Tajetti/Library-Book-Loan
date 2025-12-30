# 📚 Book Loan System

A simple and efficient system for managing book loans in a library, developed in Java.

## 📋 Description

This project implements a library system that allows you to:
- **Register authors and books** in the library  
- **View available books** for loan  
- **Loan books** by registering the client  
- **Control book availability**  
- **Register returns** of borrowed books  

## 🏗️ Project Architecture

### Class Structure

- **`Autor.java`** – Represents a book author with ID, name, and birth date  
- **`Livro.java`** – Represents a book with ID, title, author, and availability status  
- **`Emprestimo.java`** – Records a loan with ID, book, client, loan date, and return date  
- **`Biblioteca.java`** – Main manager that controls authors, books, and loans  
- **`Main.java`** – Interactive command-line interface  

## 🚀 How to Use

### Compile the Project

```bash
javac src/*.java -d .
```

### Run the Program

```bash
java Main
```

### Usage Flow

1. The program starts with a few pre-registered books  
2. You will be asked whether you want to see the list of available books  
3. If you choose **“YES”**:
   - The book list will be displayed  
   - Enter the ID of the book you want to borrow  
   - Provide your name as the client  
   - The loan will be registered  
4. If you choose **“NO”**, the program closes  

## 📚 Initial Books

The system starts with the following pre-registered books:

| ID | Title | Author |
|---|---|---|
| 1 | Dom Casmurro | Machado de Assis |
| 2 | A Hora da Estrela | Clarice Lispector |
| 3 | Memórias Póstumas de Brás Cubas | Machado de Assis |

## 💡 Main Features

- ✅ Available book listing  
- ✅ Book search by ID  
- ✅ Loan record with date  
- ✅ Availability control  
- ✅ Friendly interface with emojis  

## 🔧 Requirements

- Java 8 or higher  
- Operating system: Windows, macOS, or Linux  

## 📝 Example Output

```
Would you like to see the list of available books? (YES/NO): YES

📚 Available books:
[1] Dom Casmurro - Machado de Assis (Available)
[2] A Hora da Estrela - Clarice Lispector (Available)
[3] Memórias Póstumas de Brás Cubas - Machado de Assis (Available)

Enter the ID of the book you want to borrow: 1
Enter your name: João Silva

👋 Thanks for using the library system!
```

## 🎯 Possible Future Improvements

- [ ] Database persistence  
- [ ] Graphical User Interface (GUI)  
- [ ] Late fee system  
- [ ] Loan limit per client  
- [ ] Loan reports  
- [ ] User authentication  

## 👨‍💻 Author

Developed as a book loan system project.

---

**Last update:** December 30, 2025
