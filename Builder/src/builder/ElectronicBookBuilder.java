package builder;

public class ElectronicBookBuilder implements BaseBuilder {

    private Book book;

    public ElectronicBookBuilder() {
        this.book = new Book();
    }

    @Override
    public void addTitle() {
        this.book.setTitle("Electronic book title");
    }

    @Override
    public void addAuthor() {
        this.book.setAuthor("Electronic book author");
    }

    @Override
    public void addCode() {
        this.book.setIsbnCode("electronic book code");
    }

    @Override
    public Book getBook() {
        return book;
    }
}
