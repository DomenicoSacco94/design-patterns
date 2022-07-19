package factory;

import factory.Book;

public class ThrillerBook extends Book {

    @Override
    public void readBook() {
        System.out.println("reading a Thriller Book");
    }
}