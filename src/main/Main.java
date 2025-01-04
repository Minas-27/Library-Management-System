package main;

import model.Book;
import service.Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> {
                        try {
                            System.out.print("Enter Book ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Enter Book Title: ");
                            String title = scanner.nextLine();
                            System.out.print("Enter Book Author: ");
                            String author = scanner.nextLine();
                            System.out.print("Enter Book ISBN: ");
                            String isbn = scanner.nextLine();
                            System.out.print("Enter Book Genre: ");
                            String genre = scanner.nextLine();
                            System.out.print("Enter Publication Year: ");
                            int publicationYear = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            System.out.print("Enter Publisher: ");
                            String publisher = scanner.nextLine();
                            System.out.print("Enter Number of Pages: ");
                            int numberOfPages = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            Book book = new Book(id, title, author, isbn, genre, publicationYear, publisher, numberOfPages);
                            library.addBook(book);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter valid data.");
                            scanner.nextLine(); // Clear the buffer
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.print("Enter Book ID to Remove: ");
                            int id = scanner.nextInt();
                            library.removeBook(id);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid Book ID.");
                            scanner.nextLine(); // Clear the buffer
                        }
                    }
                    case 3 -> {
                        try {
                            System.out.print("Enter Keyword to Search (Title/Author): ");
                            String keyword = scanner.nextLine();
                            library.searchBook(keyword);
                        } catch (Exception e) {
                            System.out.println("An error occurred during search: " + e.getMessage());
                        }
                    }
                    case 4 -> {
                        try {
                            library.displayBooks();
                        } catch (Exception e) {
                            System.out.println("An error occurred while displaying books: " + e.getMessage());
                        }
                    }
                    case 5 -> {
                        try {
                            System.out.print("Enter Book ID to Borrow: ");
                            int id = scanner.nextInt();
                            library.borrowBook(id);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid Book ID.");
                            scanner.nextLine(); // Clear the buffer
                        }
                    }
                    case 6 -> {
                        try {
                            System.out.print("Enter Book ID to Return: ");
                            int id = scanner.nextInt();
                            library.returnBook(id);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid Book ID.");
                            scanner.nextLine(); // Clear the buffer
                        }
                    }
                    case 7 -> {
                        System.out.println("Exiting the Library Management System. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice! Please enter a valid number.");
                scanner.nextLine(); // Clear the buffer
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
