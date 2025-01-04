# Library Management System

## Description

The Library Management System is a simple yet efficient system designed to help manage books within a library. This system supports a variety of features, such as adding, removing, searching, displaying, borrowing, and returning books. It's built using Java and demonstrates Object-Oriented Programming (OOP) principles such as classes, inheritance, and polymorphism. Exception handling is also integrated into the system to ensure a smooth user experience and avoid crashes due to invalid inputs.

## Features

- Add Book: Adds a new book to the library with details such as ID, title, author, ISBN, genre, publication year, publisher, and number of pages.
- Remove Book: Removes a book from the library by specifying its ID.
- Search Book: Searches for a book by title or author.
- Display All Books: Displays a list of all books currently in the library.
- Borrow Book: Allows a user to borrow a book from the library by specifying the book's ID.
- Return Book: Allows a user to return a borrowed book to the library by specifying its ID.
- Exception Handling: Proper exception handling is implemented to catch and display error messages when invalid inputs are entered.

## Technologies Used

- Java: The core programming language for the entire application.
- Object-Oriented Programming (OOP): Encapsulation, inheritance, and polymorphism.
- Scanner: To handle user inputs via the console.
- Exceptions: For handling errors such as invalid inputs and out-of-bound IDs.

## Prerequisites

Before running the project, make sure that you have the following installed on your system:

- Java Development Kit (JDK) version 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans) for easy coding and debugging.
- Git (optional, for version control).

## Project Structure

The project follows a simple structure that organizes the code into separate packages for clarity and maintainability.

```
Library-Management-System/
├── model/
│   └── Book.java           # Contains the Book class representing a book object.
├── service/
│   └── Library.java        # Contains the Library class for managing books.
├── main/
│   └── Main.java           # The entry point for the program (user interface).
├── README.md               # Project documentation.
└── .gitignore              # Git ignore file for unnecessary files.
```

### Class Breakdown:

1. Book.java (Model Class): This class represents a book with properties such as ID, title, author, ISBN, genre, publication year, publisher, and number of pages. It also contains necessary methods like getters, setters, and a `toString()` method for displaying book details.

2. Library.java (Service Class): This class handles the logic for managing the library's collection of books. It includes methods for adding, removing, searching, displaying, borrowing, and returning books. The class stores books in a list and performs operations on them.

3. Main.java (Main Class): The entry point of the application. This class contains the console-based user interface, allowing the user to interact with the system. It uses a `Scanner` object to capture user input and calls corresponding methods in the `Library` class to perform actions.

## Installation

To get this project up and running on your local machine, follow these steps:

1. Clone the Repository:
   ```bash
   git clone https://github.com/Minas-27/Library-Management-System.git
   ```

2. Navigate to the Project Folder:
   ```bash
   cd Library-Management-System
   ```

3. Open the Project:
   Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, etc.).

4. Run the Application:
   Run the `Main.java` file in your IDE to start the application. You can now interact with the Library Management System through the console.

## Usage

After running the program, you'll see a simple console interface. You can perform the following actions:

1. Add Book: 
   - Enter the book's details (ID, title, author, etc.) to add a new book to the system.
   
2. Remove Book: 
   - Enter the Book ID of the book you wish to remove from the library.
   
3. Search Book: 
   - Enter a keyword (either title or author) to search for a book in the system.
   
4. Display All Books: 
   - View the list of all books currently stored in the library.
   
5. Borrow Book: 
   - Enter the Book ID of the book you'd like to borrow from the library.
   
6. Return Book: 
   - Enter the Book ID of the book you're returning to the library.
   
7. Exit: 
   - Exit the program.

### Sample Console Output:

```
Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display All Books
5. Borrow Book
6. Return Book
7. Exit
Enter your choice: 1
Enter Book ID: 101
Enter Book Title: ፍቅር እስከ መቃብር
Enter Book Author: ሃዲስ አለማየሁ
Enter Book ISBN: 9780743273565
Enter Book Genre: Fiction
Enter Publication Year: 1925
Enter Publisher: Kuraz
Enter Number of Pages: 678
Book added successfully!

Library Management System
1. Add Book
2. Remove Book
3. Search Book
4. Display All Books
5. Borrow Book
6. Return Book
7. Exit
Enter your choice: 4
Displaying all books in the library:
Book ID: 101, Title: ፍቅር እስከ መቃብር, Author: ሃዲስ አለማየሁ
```

## Contribution

If you wish to contribute to this project, feel free to fork the repository and submit a pull request. Any contributions such as bug fixes, features, and improvements are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any questions or inquiries, feel free to reach out:

Email: abrahamaddisu444@gmail.com
GitHub: Minas-27
