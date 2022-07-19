package factory;

public abstract class Book {
    public abstract void readBook();

    public void openBook() {
        System.out.println("Opening a book");
    }
}