package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.PrintStream;
import java.util.List;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.*;

public class ConsoleTest {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    public static final String BOOK_LIST_TITLE = "List of Books:";

    private Console console;
    private PrintStream printStreamMock;
    private Library libraryMock;

    @Mock
    private List<Book> books;

    @Before
    public void setupStream() throws Exception {
        printStreamMock = mock(PrintStream.class);
        libraryMock = mock(Library.class);

        when(libraryMock.getBooksString()).thenReturn("");

        console = new Console(printStreamMock, libraryMock);
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        console.printWelcomeMessage();

        verify(printStreamMock).println(WELCOME);
    }

    @Test
    public void shouldPrintBookList() {
        console.printBookList();

        verify(printStreamMock).println(startsWith(BOOK_LIST_TITLE));
    }
}