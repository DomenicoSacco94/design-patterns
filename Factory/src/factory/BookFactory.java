package factory;

import factory.Book;

public class BookFactory extends BaseBookFactory {
    @Override
    public Book createBook(String type) {
        Book book;
        switch(type.toLowerCase()) {
            case "novel":
                book = new NovelBook();
                break;
            case "thriller":
                book = new ThrillerBook();
                break;
            default: throw new IllegalArgumentException("No such book.");
        }
        book.openBook();
        book.readBook();
        return book;
    }
}