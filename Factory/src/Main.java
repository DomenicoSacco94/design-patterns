class Main {
    public static void main(String args[]) {
        BookFactory factory = new BookFactory();
        factory.createBook("thriller");
        factory.createBook("novel");
    }
}