package org.designpatterns.behavioural.IteratorPattern.WithPattern;

public class BookV2 implements Comparable<BookV2> {

    private String title;

    protected BookV2(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BookV1{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(BookV2 o) {
        return this.title.compareTo(o.title);
    }
}