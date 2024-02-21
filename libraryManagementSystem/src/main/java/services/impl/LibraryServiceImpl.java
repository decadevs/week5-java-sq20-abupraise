package services.impl;

import model.Books;
import model.Person;
import model.ComparingPersons;
import services.LibraryService;

import java.util.*;

public class LibraryServiceImpl implements LibraryService {

    Queue<Person> orderedUsersQueue;
    PriorityQueue<Person> libraryUsersOnQueue;
    public LibraryServiceImpl(){
        libraryUsersOnQueue = new PriorityQueue<>(new ComparingPersons());
        orderedUsersQueue = new LinkedList<>();
    }

    @Override
    public String borrowBook(Books book) {
        if (book.getNumberOfBooks() > 0){
            book.setNumberOfBooks(book.getNumberOfBooks()-1);

            Person person = libraryUsersOnQueue.poll();

            return person.getName() + ", has borrowed " + book.getBookName() + " successfully";
        } else {

            return book.getBookName() + " is taken";
        }

    }

    @Override
    public String borrowBookInFIFO(Books book) {
        if (book.getNumberOfBooks() > 0){
            book.setNumberOfBooks(book.getNumberOfBooks()-1);

            Person person = orderedUsersQueue.poll();

            return person.getName() + ", You have successfully borrowed " + book.getBookName();
        } else {

            return book.getBookName() + " is taken";
        }
    }

    @Override
    public String returnBook(Books book) {
        book.setNumberOfBooks(book.getNumberOfBooks()+1);

        return "You have successfully returned " + book.getBookName();


    }

    @Override
    public void readersOnQueue(Person person) {
        libraryUsersOnQueue.add(person);
        orderedUsersQueue.add(person);
    }
}
