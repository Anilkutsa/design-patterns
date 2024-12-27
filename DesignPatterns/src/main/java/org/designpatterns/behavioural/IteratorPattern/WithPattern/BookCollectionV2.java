package org.designpatterns.behavioural.IteratorPattern.WithPattern;

import org.designpatterns.behavioural.IteratorPattern.WithPattern.BookV2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Iterator Pattern provides a way to traverse a collection without revealing
 * its underlying structure, offering a uniform interface for traversal.
 * <p>
 * Structure:
 * - Iterator: Interface for traversing a collection.
 * - Collection: Holds the elements and provides an iterator.
 * <p>
 * Benefits -
 * 1. Separation of Concerns: The traversal logic is separated from the collection itself, allowing you to change one without affecting the other.
 * 2. Uniform Interface: The same interface (Iterator) is used to traverse different types of collections, making the code more flexible.
 * 3. Simplified Client Code: The client doesn’t need to know the underlying data structure, reducing coupling and making the code easier to maintain.
 * 4. Multiple Traversal Strategies: You can implement multiple types of iterators (e.g., forward, backward, filtered) without changing the collection.
 */

public class BookCollectionV2 {
    private List<BookV2> books = new ArrayList<>();

    public void addBook(BookV2 book) {
        books.add(book);
    }

    public List<BookV2> getBooks() {
        return books;
    }

    public Iterator<BookV2> createIterator() {
        return new BookIterator(this.books);
    }

    //Another Class (Nested Class)
    private class BookIterator implements Iterator<BookV2> {
        private List<BookV2> books;
        private int position = 0;

        public BookIterator(List<BookV2> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public BookV2 next() {
            return books.get(position++);
        }
    }
}