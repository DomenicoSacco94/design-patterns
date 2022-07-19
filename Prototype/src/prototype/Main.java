package prototype;

class Main {
    public static void main(String args[]) {
        EBook eBook = (EBook) BookManager.getClonedBook("eBook");
        EBook eBook2 = (EBook) BookManager.getClonedBook("eBook");
        CloneableBook textBook = BookManager.getClonedBook("textBook");
        System.out.println(eBook.getSubScriptionKey().getUserName());
        System.out.println(eBook.getSubScriptionKey().getCode());
        eBook.getSubScriptionKey().setCode("123");
        //since the copy is deep there is no change and 123 is not displayed
        System.out.println(eBook2.getSubScriptionKey().getCode());
        System.out.println(textBook.getLines());
    }
}