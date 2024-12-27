package org.designpatterns.behavioural.IteratorPattern.WithoutPattern;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollectionV1 bookCollection = new BookCollectionV1();
        bookCollection.addBook(new BookV1("C++ BookV1"));
        bookCollection.addBook(new BookV1("Java BookV1"));
        bookCollection.addBook(new BookV1("Python BookV1"));

        for (int i = 0; i < bookCollection.getBooks().size(); i++) {
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
