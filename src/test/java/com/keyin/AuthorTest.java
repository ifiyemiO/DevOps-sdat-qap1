package com.keyin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthorTest {
    @Test
    void testAuthorCreation() {
        // Create an author object
        Author author = new Author("J.K. Rowling", "Harry Potter");

        // Test if the author's name and title are set correctly
        assertEquals("J.K. Rowling", author.getName());
        assertEquals("Harry Potter", author.getTitle());
    }

    @Test
    void testSetters() {
        // Create an author object
        Author author = new Author("J.K. Rowling", "Harry Potter");

        // Update the author's name and title using setters
        author.setName("George Orwell");
        author.setTitle("1984");

        // Test if the values were updated correctly
        assertEquals("George Orwell", author.getName());
        assertEquals("1984", author.getTitle());
    }

    @Test
    void testToString() {
        // Create an author object
        Author author = new Author("J.K. Rowling", "Harry Potter");

        // Test the toString method output
        String expectedString = "Author{name='J.K. Rowling', title='Harry Potter'}";
        assertEquals(expectedString, author.toString());
    }
}
