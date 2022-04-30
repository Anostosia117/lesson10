package lesson10;

import java.util.Objects;

public class Book {
    String nameOfBook;
    Author author;
    private int yearOfPublishing;

    public Book(String nameOfBook, Author author, int yearOfPublishing) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }


    public String getNameOfBook() {
        return this.nameOfBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublishing() {

        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {

        this.yearOfPublishing = yearOfPublishing;
    }

    public String toString() {
        return "Название книги: " + this.nameOfBook + ". Имя автора: " + this.author + ". Год издания: " + this.yearOfPublishing;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        Book book = (Book) other;
            if (nameOfBook.equals(book.nameOfBook))
                return true;
            if (author.equals(book.author))
                return true;
            if (yearOfPublishing == book.yearOfPublishing)
                return true;
            return false;
        }
    @Override
    public int hashCode() {
        return Objects.hash(nameOfBook, author, yearOfPublishing);
    }
    }






