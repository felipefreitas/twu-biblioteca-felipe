package com.twu.biblioteca.view;

import java.io.PrintStream;

public class ConsoleApplication {

    private PrintStream _printStream;

    public ConsoleApplication(PrintStream printStream) {
        this._printStream = printStream;
    }

    public void showWelcomeMessage() {
        this._printStream.println("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!");
    }
}
