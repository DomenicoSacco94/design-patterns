package prototype;

public class TextBook extends CloneableBook {

    public TextBook(Lines lines) {
        super(lines);
    }

    @Override
    public CloneableBook cloneBook() {
        System.out.println("cloning the textbook");
        TextBook textBook = null;
        try {
            textBook = (TextBook) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return textBook;
    }

}
