package prototype;

public abstract class CloneableBook implements Cloneable {
    private Lines lines;

    public CloneableBook(Lines lines) {
        this.lines = lines;
    }

    public Lines getLines() {
        return lines;
    }

    public void setLines(Lines lines) {
        this.lines = lines;
    }

    public abstract CloneableBook cloneBook() throws CloneNotSupportedException;
}
