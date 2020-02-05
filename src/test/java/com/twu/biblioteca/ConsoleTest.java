package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ConsoleTest {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    private Console _console;
    private PrintStream _printStreamMock;

    @Before
    public void setupStream() throws Exception {
        _printStreamMock = mock(PrintStream.class);
        _console = new Console(_printStreamMock);
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        _console.printWelcomeMessage();

        verify(_printStreamMock).println(WELCOME);
    }

    @Test
    public void shouldPrintBookList() {
        _console.printBookList();

        verify(_printStreamMock).println(startsWith("List"));
    }
}