package com.twu.biblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        Library library = new Library();
        Console console = new Console(System.out, library);

        console.printWelcomeMessage();
    }
}
