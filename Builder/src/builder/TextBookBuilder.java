package builder;

public class TextBookBuilder implements BaseBuilder {

    private Book book;

    public TextBookBuilder() {
        this.book = new Book();
    }

    @Override
    public void addTitle() {
        this.book.setTitle("Text book title");
    }

    @Override
    public void addAuthor() {
        this.book.setAuthor("Text book author");
    }

    @Override
    public void addCode() {
        this.book.setIsbnCode("Text book code");
    }

    @Override
    public Book getBook() {
        return book;
    }
}
