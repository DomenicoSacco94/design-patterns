public class SingletonLazy {
    private static SingletonLazy singletonInstance = null;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new SingletonLazy();
        }
            return singletonInstance;
    }
}
