package prototype;

import java.util.HashMap;

public class BookManager {
    private static HashMap<String, CloneableBook> prototypes = new HashMap<>();

    static {
        Lines lines = new Lines(new String[]{"placeHolder line"});
        EBook ebook = new EBook(lines);
        SubScriptionKey subScriptionKey = new SubScriptionKey("user placeholder", "name placeholder");
        ebook.setSubScriptionKey(subScriptionKey);
        TextBook textBook = new TextBook(lines);
        prototypes.put("textBook", textBook);
        prototypes.put("eBook", ebook);
    }


    public static CloneableBook getClonedBook(final String type) {
        CloneableBook clonedDoc = null;
        try {
            CloneableBook doc = prototypes.get(type);
            clonedDoc = doc.cloneBook();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedDoc;
    }

}
