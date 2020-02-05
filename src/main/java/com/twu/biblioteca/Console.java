package com.twu.biblioteca;

import java.io.PrintStream;

public class Console {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
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
        this.library.getBooks();
        this.printStream.println("List of Books:");
    }
}
