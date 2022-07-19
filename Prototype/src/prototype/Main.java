package prototype;

class Main {
    public static void main(String args[]) {
        EBook eBook = (EBook) BookManager.getClonedBook("eBook");
        CloneableBook textBook = BookManager.getClonedBook("textBook");
        System.out.println(eBook.getSubScriptionKey().getUserName());
        System.out.println(eBook.getSubScriptionKey().getCode());
        System.out.println(textBook.getLines());
    }
}