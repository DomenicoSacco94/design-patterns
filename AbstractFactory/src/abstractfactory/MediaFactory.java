package abstractfactory;

public class MediaFactory extends BaseCreator<Media> {
    @Override
    public Media create(String type) {
        Media media;
        switch (type.toLowerCase()) {
            case "audio":
                media = new Audio();
                break;
            case "hypertext":
                media = new HyperText();
                break;
            default:
                throw new IllegalArgumentException("No such book.");
        }
        media.play();
        return media;
    }

}
