package org.example;

public class Book {
    private String tittle;
    private Author author;
    private int yearOfPublication;

    public Book(String tittle, Author author, int yearOfPublication) {
        this.tittle = tittle;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTittle() {
        return tittle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
