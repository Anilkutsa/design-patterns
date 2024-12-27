package org.designpatterns.behavioural.IteratorPattern.WithPattern;

import java.util.Iterator;

public class ClientV3 {

    public static void main(String[] args) {
        BookCollectionV3 bookCollection = new BookCollectionV3();
        bookCollection.addBook(new BookV2("Python BookV2"));
        bookCollection.addBook(new BookV2("C++ BookV2"));
        bookCollection.addBook(new BookV2("Java BookV2"));

        Iterator<BookV2> iterator = bookCollection.iterator(); //Standardized

        while (iterator.hasNext()) {
            BookV2 book = iterator.next();
            System.out.println(book);
        }
    }
}