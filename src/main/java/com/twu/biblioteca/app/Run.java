package com.twu.biblioteca.app;

import com.twu.biblioteca.view.ConsoleApplication;

public class Run {
    public static void main(String[] args) {
        ConsoleApplication consoleApplication = new ConsoleApplication(System.out);

        consoleApplication.showWelcomeMessage();
    }
}
