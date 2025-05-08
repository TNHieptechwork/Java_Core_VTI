package org.example;

import org.example.models.Book;
import org.example.models.LibManager;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        LibManager libManager = new LibManager();

        Book b1 = new Book("Book1","Naruto","Akira",true);
        Book b2 = new Book("Book2","onePiece","Haha",true);
        Book b3 = new Book("Book3","Fast & Furious","The Rock",true);
        Book b4 = new Book("Book4","Marvel","DC",true);

        libManager.addBook(b1);
        libManager.addBook(b2);
        libManager.addBook(b3);
        libManager.addBook(b4);

        User u1 = new User("U1","Rudiger");
        User u2 = new User("U2","Antony");
        User u3 = new User("U3","Mpappe");

        libManager.addUser(u1);
        libManager.addUser(u2);
        libManager.addUser(u3);

        libManager.borrowBook("U1","Book1");
        libManager.borrowBook("U1","Book3");
        libManager.borrowBook("U3","Book4");

        libManager.printListBookBorrow();

        libManager.returnBook("U1","Book1");
        libManager.returnBook("U3","Book4");

        libManager.printListBookReturned();

        libManager.findBookBorrowed_past("U1");
        libManager.findBookBorrowed_past("U3");

    }
}