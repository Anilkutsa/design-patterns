package org.designpatterns.behavioural.IteratorPattern.WithoutPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Suppose you have a collection, such as an array or list,
 * and you need to provide a mechanism for accessing its elements.
 * <p>
 * Without the iterator pattern, the client code needs to understand how
 * the collection is structured, and different collections would require
 * different methods to traverse them.
 * <p>
 * Drawback -
 * - The client needs to know the internal structure of the collection (array in this case).
 * - If we change the collection type (e.g., from an array to a linked list), we would need to modify the client code.
 * - It’s harder to implement different traversal strategies.
 */
public class BookCollectionV1 {

    private List<BookV1> books = new ArrayList<>();

    public void addBook(BookV1 book) {
        books.add(book);
    }

    public List<BookV1> getBooks() {
        return books;
    }

}
