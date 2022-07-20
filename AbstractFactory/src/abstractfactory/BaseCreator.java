package abstractfactory;

public abstract class BaseCreator<T> {
    public abstract T create(String type);
}
