package com.twu.biblioteca;

import java.io.PrintStream;

public class Console {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    private PrintStream _printStream;

    public Console(PrintStream printStream) {
        this._printStream = printStream;
    }

    public void printWelcomeMessage() {
        this._printStream.println(WELCOME);
    }

    public void printBookList() {
    }
}