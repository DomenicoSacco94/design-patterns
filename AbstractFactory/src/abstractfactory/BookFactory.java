package abstractfactory;

public class BookFactory extends BaseCreator<Book> {
    @Override
    public Book create(String type) {
        Book book;
        switch (type.toLowerCase()) {
            case "novel":
                book = new NovelBook();
                break;
            case "thriller":
                book = new ThrillerBook();
                break;
            default:
                throw new IllegalArgumentException("No such book.");
        }
        book.read();
        return book;
    }

}
