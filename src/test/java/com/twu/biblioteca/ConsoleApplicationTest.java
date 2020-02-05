package com.twu.biblioteca.view;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConsoleApplicationTest {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    private ConsoleApplication consoleApplication;
    private PrintStream printStreamMock;

    @Before
    public void setupStream() throws Exception {
        printStreamMock = mock(PrintStream.class);
        consoleApplication = new ConsoleApplication(printStreamMock);
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        consoleApplication.printWelcomeMessage();

        verify(printStreamMock).println(WELCOME);
    }

    @Test
    public void shouldPrintBookList() {
        consoleApplication.printBookList();

        verify(printStreamMock).println(startsWith("List"));
    }
}