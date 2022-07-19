package builder;

class Main {
    public static void main(String args[]) {
        TextBookBuilder textBookBuilder = new TextBookBuilder();
        BookInitializer initializer = new BookInitializer(textBookBuilder);
        Book book = initializer.createBook();
        System.out.println(book);
        ElectronicBookBuilder electronicBookBuilder = new ElectronicBookBuilder();
        initializer = new BookInitializer(electronicBookBuilder);
        book = initializer.createBook();
        System.out.println(book);
    }
}