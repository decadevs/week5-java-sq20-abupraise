package services;

import model.Books;
import model.Person;

public interface LibraryService {

    public String borrowBook(Books book);
    public String borrowBookInFIFO(Books book);

    public String returnBook(Books book);
    public void readersOnQueue(Person person);

}
