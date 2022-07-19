package prototype;

public class EBook extends CloneableBook {
    private SubScriptionKey subScriptionKey;

    public EBook(Lines lines) {
        super(lines);
    }

    public SubScriptionKey getSubScriptionKey() {
        return subScriptionKey;
    }

    public void setSubScriptionKey(SubScriptionKey subScriptionKey) {
        this.subScriptionKey = subScriptionKey;
    }

    @Override
    public CloneableBook cloneBook() throws CloneNotSupportedException {
        System.out.println("cloning the ebook");
        EBook ebook;
        ebook = (EBook) super.clone();
        SubScriptionKey subScriptionKey = (SubScriptionKey) ebook.getSubScriptionKey().clone();
        ebook.setSubScriptionKey(subScriptionKey);
        return ebook;
    }
}
