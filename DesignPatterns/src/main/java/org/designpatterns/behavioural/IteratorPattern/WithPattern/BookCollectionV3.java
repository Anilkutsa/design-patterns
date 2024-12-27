package org.designpatterns.behavioural.IteratorPattern.WithPattern;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookCollectionV3 implements Iterable<BookV2> {
    private Set<BookV2> books = new TreeSet<>();

    public void addBook(BookV2 book) {
        books.add(book);
    }

    @Override
    public Iterator<BookV2> iterator() {
        return books.iterator();
    }
}