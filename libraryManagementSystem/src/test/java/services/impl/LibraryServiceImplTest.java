package services.impl;

import model.Books;
import model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    private LibraryServiceImpl libraryService;

    @BeforeEach
    void setUp() {
        libraryService = new LibraryServiceImpl();
    }

    @Test
    void testBorrowBook() {
        Books book = new Books("Test Book", "Test Author", 123, 2);
        Person person = new Person("John", 001, true, false, false);
        libraryService.readersOnQueue(person);
        assertEquals("John, has borrowed Test Book successfully", libraryService.borrowBook(book));
    }

    @Test
    void testBorrowBookInFIFO() {
        Books book = new Books("Test Book", "Test Author", 123, 2);
        Person person = new Person("John", 001, true, false, false);
        libraryService.readersOnQueue(person);
        assertEquals("John, You have successfully borrowed Test Book", libraryService.borrowBookInFIFO(book));
    }

    @Test
    void testReturnBook() {
        Books book = new Books("Test Book", "Test Author", 123, 2);
        libraryService.returnBook(book);
        assertEquals("You have successfully returned Test Book", libraryService.returnBook(book));
    }

//    @Test
//    void testReadersOnQueue() {
//        Person person1 = new Person("John", 001, true, false, false);
//        Person person2 = new Person("Alice", 002, false, true, false);
//        libraryService.readersOnQueue(person1);
//        libraryService.readersOnQueue(person2);
//        assertEquals(2, libraryService.getOrderedUsersQueue().size());
//        assertEquals(2, libraryService.getLibraryUsersOnQueue().size());
//    }
}
