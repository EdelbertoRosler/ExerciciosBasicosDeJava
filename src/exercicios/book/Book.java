package exercicios.book;

import exercicios.book.enums.Language;

import java.util.Objects;

public class Book {
    private String name, publisher, author, year;
    private int id;
    private Language language;

    public Book(int id, String name, String publisher, String author, String year, Language language) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.author = author;
        this.year = year;
        this.language = language;
    }


    @Override
    public String toString() {
        return "Book name: " + name +
                "; publisher: " + publisher +
                "; author: " + author +
                "; year: " + year +
                "; language: " + language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(name, book.name) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(author, book.author) &&
                Objects.equals(year, book.year) &&
                language == book.language;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, publisher, author, year, language);
    }

    public int getId() { return id; }

    public void setId() { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPublisher() { return publisher; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public Language getLanguage() { return language; }


}
