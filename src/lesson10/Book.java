package lesson10;

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
        return nameOfBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}

