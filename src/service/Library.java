package service;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Remove a book by ID
    public void removeBook(int id) {
        books.removeIf(book -> book.getId() == id);
        System.out.println("Book removed successfully!");
    }

    // Search for a book by title or author
    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the keyword: " + keyword);
        }
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Borrow a book by ID
    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println("Book borrowed successfully!");
                return;
            } else if (book.getId() == id) {
                System.out.println("Book is already borrowed.");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }

    // Return a book by ID
    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned successfully!");
                return;
            } else if (book.getId() == id) {
                System.out.println("Book was not borrowed.");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }
}
