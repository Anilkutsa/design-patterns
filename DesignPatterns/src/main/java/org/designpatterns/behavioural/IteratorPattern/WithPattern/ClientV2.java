package org.designpatterns.behavioural.IteratorPattern.WithPattern;

import java.util.Iterator;

public class ClientV2 {

    public static void main(String[] args) {
        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new BookV2("C++ BookV2"));
        bookCollection.addBook(new BookV2("Java BookV2"));
        bookCollection.addBook(new BookV2("Python BookV2"));

        Iterator<BookV2> iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            BookV2 book = iterator.next();
            System.out.println(book);
        }
    }
}