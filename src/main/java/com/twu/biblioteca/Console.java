package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Console {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    public static final String BOOK_LIST_TITLE = "List of Books:";

    private final Library library;
    private PrintStream printStream;

    public Console(PrintStream printStream, Library library) {
        this.printStream = printStream;
        this.library = library;
    }

    public void printWelcomeMessage() {
        this.printStream.println(WELCOME);
    }

    public void printBookList() {
        List<Book> books = this.library.getBooks();

        this.printStream.println(BOOK_LIST_TITLE);
    }
}
