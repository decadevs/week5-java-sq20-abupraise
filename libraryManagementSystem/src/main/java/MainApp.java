import enums.PersonType;
import java.util.*;
import model.*;
import services.impl.LibraryServiceImpl;


public class MainApp {

    public static void main(String[] args) {
//        List<Person> libUsers = new ArrayList<>();
        Person person1 = new Person("David E.", 001, false, true, false);
        Person person2 = new Person("Roselyn Aime", 002, false, true, false);
        Person person3 = new Person("Ireti Gold", 003, false, true, false);
        Person person4 = new Person("Samuel David", 004, true, false, false);
        Person person5 = new Person("Grace Osazuwa", 005, true, false, false);
        Person person6 = new Person("Charis Osazuwa", 005, false, false, true);

        Books book1 = new Books("Effectual Communication", "Samuel Sparks", 001, 2);
        Books book2 = new Books("Sound Health is Possible", "Dr. Iwinosa Ahanor", 002, 3);
        Books book3 = new Books("Understanding Python", "James", 003, 3);
        Books book4 = new Books("Living the God-Life", "Dr. Princess Faith E.", 004, 3);
        Books book5 = new Books("Embedded Systems in C++", "Engr. Mosh P.", 005, 0);
        LibraryServiceImpl libraryService = new LibraryServiceImpl();

        libraryService.readersOnQueue(person3);
        libraryService.readersOnQueue(person2);
        libraryService.readersOnQueue(person1);
        libraryService.readersOnQueue(person4);
        libraryService.readersOnQueue(person5);
        libraryService.readersOnQueue(person6);


        System.out.println(libraryService.borrowBook(book1));
        System.out.println(libraryService.borrowBook(book2));
        System.out.println(libraryService.borrowBook(book2));
        System.out.println(libraryService.borrowBook(book3));
        System.out.println(libraryService.borrowBook(book3));
        System.out.println(libraryService.borrowBook(book4));

//        System.out.println(libraryService.borrowBookInFIFO(book1));
//        System.out.println(libraryService.borrowBookInFIFO(book2));
//        System.out.println(libraryService.borrowBookInFIFO(book4));
//        System.out.println(libraryService.borrowBookInFIFO(book5));
//        System.out.println(libraryService.borrowBookInFIFO(book3));
//        System.out.println(libraryService.borrowBookInFIFO(book1));

    }
}