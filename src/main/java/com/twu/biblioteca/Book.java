package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name='" + this.name + '\'' +
                ", author='" + this.author + '\'' +
                '}';
    }
}
