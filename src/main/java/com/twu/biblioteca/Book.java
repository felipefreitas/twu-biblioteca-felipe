package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;

    @Override
    public String toString() {
        return "Book {" +
                "name='" + this.name + '\'' +
                ", author='" + this.author + '\'' +
                '}';
    }
}
