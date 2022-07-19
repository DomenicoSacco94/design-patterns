package factory;

import factory.Book;

public abstract class BaseBookFactory {
    public abstract Book createBook(String type);
}