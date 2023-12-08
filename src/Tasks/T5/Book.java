package Tasks.T5;

import Tasks.Validator;

import static Tasks.Validator.isValidNumberOfPages;
import static Tasks.Validator.isValidYear;

/**
 * This class represents a book with attributes such as the author, title, year, etc.
 * It demonstrates the use of the Builder Design Pattern.
 * The Builder Design Pattern is used here to construct a Book object.
 * All fields of the Book class are private (Encapsulation) and are accessed via public methods (setters and getters).
 */

public class Book {
    /**
     * The title of the book
     */
    private String title;

    /**
     * The full name of the author of the book
     */
    private String author;

    /**
     * The year the book was published
     */
    private int year;

    /**
     * The name of the publishing house that published the book
     */
    private String publishingHouse;

    /**
     * The genre of the book
     */
    private String genre;

    /**
     * The total number of pages in the book
     */
    private int numberOfPages;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.year = builder.year;
        this.publishingHouse = builder.publishingHouse;
        this.genre = builder.genre;
        this.numberOfPages = builder.numberOfPages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + ", Author: " + getAuthor() + ", Year: " + getYear() +
                ", Publishing house: " + getPublishingHouse() + ", Genre: " + getGenre() +
                ", Number of pages: " + getNumberOfPages();
    }

    /**
     * Nested static Builder class
     * The Builder class follows the steps of the Builder Design Pattern,
     * providing a way to construct complex objects step by step.
     */
    public static class Builder {
        // These are the properties needed to create an object of the Book class.
        private String title;
        private String author;
        private int year;
        private String publishingHouse;
        private String genre;
        private int numberOfPages;

        /**
         * This constructor initiates the author and title for the book.
         * It validates the input for these obligatory parameters.
         *
         * @param title  Title of the book. Cannot be null.
         * @param author Author of the book. Cannot be null.
         */
        public Builder(String title, String author) {
            this.title = Validator.validateString(title, "Title cannot be null");
            this.author = Validator.validateString(author, "Author cannot be null");
        }

        /**
         * This method is used to set the year of publication of the book.
         * Year has to fall within valid range validated by `isValidYear` method.
         *
         * @param year Year of publication.
         * @return this, for method chaining.
         */
        public Builder year(int year) {
            if (isValidYear(year)) {
                this.year = year;
            }
            return this;
        }

        /**
         * This method is used to set the publishing house of the book.
         *
         * @param publishingHouse Name of the publishing house.
         * @return this, for method chaining.
         */
        public Builder publishingHouse(String publishingHouse) {
            this.publishingHouse = Validator.validateString(publishingHouse, "Publishing house cannot be null");
            return this;
        }

        /**
         * This method is used to set the genre of the book.
         *
         * @param genre Genre of the book.
         * @return this, for method chaining.
         */
        public Builder genre(String genre) {
            this.genre = Validator.validateString(genre, "Genre cannot be null");
            return this;
        }

        /**
         * This method is used to set the number of pages in the book.
         * Page number has to fall within valid range validated by `isValidNumberOfPages` method.
         *
         * @param numberOfPages Number of pages in the book.
         * @return this, for method chaining.
         */
        public Builder numberOfPages(int numberOfPages) {
            if (isValidNumberOfPages(numberOfPages)) {
                this.numberOfPages = numberOfPages;
            }
            return this;
        }

        /**
         * This method is used to construct the Book class.
         *
         * @return A new Book instance.
         */
        public Book build() {
            return new Book(this);
        }
    }
}