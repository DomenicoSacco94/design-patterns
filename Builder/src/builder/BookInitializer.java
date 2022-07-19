package builder;

public class BookInitializer {
    BaseBuilder builder;

    public BookInitializer(BaseBuilder builder) {
        this.builder = builder;
    }

    public Book createBook() {
        builder.addCode();
        builder.addAuthor();
        builder.addTitle();
        return builder.getBook();
    }

}
