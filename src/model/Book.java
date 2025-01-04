package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String isbn; // New field: ISBN
    private String genre; // New field: Genre
    private int publicationYear; // New field: Publication Year
    private String publisher; // New field: Publisher
    private int numberOfPages; // New field: Number of Pages
    private double rating; // New field: Rating
    private boolean isBorrowed;

    // Constructor
    public Book(int id, String title, String author, String isbn, String genre,
                int publicationYear, String publisher, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.rating = 0.0; // Default rating
        this.isBorrowed = false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getRating() {
        return rating;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0.0 and 5.0.");
        }
    }

    // Borrow and return methods
    public void borrowBook() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    // Override toString for better display
    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author +
                ", ISBN: " + isbn + ", Genre: " + genre +
                ", Published: " + publicationYear + ", Publisher: " + publisher +
                ", Pages: " + numberOfPages + ", Rating: " + rating +
                ", Borrowed: " + (isBorrowed ? "Yes" : "No");
    }
}
