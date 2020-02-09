package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.startsWith;
import static org.mockito.Mockito.*;

public class ConsoleTest {

    public static final String WELCOME = "Welcome to Biblioteca. Your one-stop-shop for great books titles in Bangalore!";
    public static final String BOOK_LIST_TITLE = "List of Books: ";
    public static final String BOOK_LIST = "List of Books: \n|'one'\t|'authorOne'\t|'2001'\t|\n|'two'\t|'authorTwo'\t|'2002'\t|";

    private Console console;
    private PrintStream printStreamMock;
    private Library libraryMock;

    @Before
    public void setupStream() throws Exception {
        printStreamMock = mock(PrintStream.class);
        libraryMock = mock(Library.class);

        when(libraryMock.getBooks())
                .thenReturn(createBookList());

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

    @Test
    public void shouldViewAuthorAndPublicationYearOnAllBooks() {
        console.printBookList();

        verify(printStreamMock).println(eq(BOOK_LIST));
    }

    private List<Book> createBookList() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("one", "authorOne", "2001"));
        books.add(new Book("two", "authorTwo", "2002"));

        return books;
    }
}