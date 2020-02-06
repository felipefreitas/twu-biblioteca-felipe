package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.*;

public class ConsoleTest {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    public static final String BOOK_LIST = "List of Books: Book {name='one', author='authorOne'}, Book {name='two', author='authorTwo'}";

    private Console console;
    private PrintStream printStreamMock;
    private Library libraryMock;

    @Before
    public void setupStream() throws Exception {
        printStreamMock = mock(PrintStream.class);
        libraryMock = mock(Library.class);

        List<Book> books = new ArrayList<>();

        books.add(new Book("one", "authorOne"));
        books.add(new Book("two", "authorTwo"));

        when(libraryMock.getBooks()).thenReturn(books);

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

        verify(printStreamMock).println(startsWith(BOOK_LIST));
    }
}