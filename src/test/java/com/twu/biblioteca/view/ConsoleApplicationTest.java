package com.twu.biblioteca.app;

import com.twu.biblioteca.view.ConsoleApplication;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConsoleApplicationTest {

    private ConsoleApplication consoleApplication;
    private PrintStream printStreamMock;

    @Before
    public void setupStream() throws Exception {
        printStreamMock = mock(PrintStream.class);
        consoleApplication = new ConsoleApplication(printStreamMock);
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        consoleApplication.showWelcomeMessage();

        verify(printStreamMock).println("Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!");
    }
}