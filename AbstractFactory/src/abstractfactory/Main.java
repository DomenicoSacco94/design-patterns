package abstractfactory;

class Main {
    public static void main(String args[]) {
        MainFactory mainFactory = new MainFactory();
        mainFactory.create("book").create("novel");
        mainFactory.create("media").create("audio");
    }
}
