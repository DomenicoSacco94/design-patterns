package builder;

public interface BaseBuilder {
    void addTitle();

    void addAuthor();

    void addCode();

    public Book getBook();
}
