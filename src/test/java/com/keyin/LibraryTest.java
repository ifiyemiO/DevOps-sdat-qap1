package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Author author = new Author("J.K. Rowling", "Author");
        Book book = new Book("Harry Potter", author);
        library.addBook(book);
        assertEquals(book, library.findBookByTitle("Harry Potter"));
    }

    @Test
    public void testBorrowBook() {
        Author author = new Author("George Orwell", "Author");
        Book book = new Book("1984", author);
        book.borrowBook();
        assertFalse(book.isAvailable());
    }
// Test to return book
    @Test
    public void testReturnBook() {
        Author author = new Author("George Orwell", "Author");
        Book book = new Book("1984", author);
        book.borrowBook();
        book.returnBook();
        assertTrue(book.isAvailable());
    }
}
