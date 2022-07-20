package abstractfactory;

public class MainFactory extends BaseCreator<BaseCreator> {
    public BaseCreator create(String type) {
        BaseCreator creator;
        switch (type.toLowerCase()) {
            case "book":
                creator = new BookFactory();
                break;
            case "media":
                creator = new MediaFactory();
                break;
            default:
                throw new IllegalArgumentException("No such book.");
        }
        return creator;
    }
}
