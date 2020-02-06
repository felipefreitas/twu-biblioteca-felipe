package com.twu.biblioteca;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    private Date year;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name='" + this.name + '\'' +
                ", author='" + this.author + '\'' +
                ", year='" + this.year + '\'' +
                '}';
    }
}
