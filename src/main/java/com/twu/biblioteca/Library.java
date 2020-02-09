package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getBooksString() {
        StringBuilder bookToString = new StringBuilder();

        books.forEach(bookToString::append);

        return bookToString.toString();
    }

}
