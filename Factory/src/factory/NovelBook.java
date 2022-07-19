package factory;

import factory.Book;

public class NovelBook extends Book {

    @Override
    public void readBook() {
        System.out.println("reading a Novel Book");
    }
}