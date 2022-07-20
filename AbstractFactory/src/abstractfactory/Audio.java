package abstractfactory;

public class Audio extends Media{

    @Override
    public void play() {
        System.out.println("Play audio");
    }
}
