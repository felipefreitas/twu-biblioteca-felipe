package com.twu.biblioteca;

import java.util.Date;

public class Book {
    private String name;
    private String author;
    private String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "|'" + this.name     + "'\t|" +
                "'" + this.author   + "'\t|" +
                "'" + this.year     + "'\t|";
    }
}
