public class SingletonMultithreadedStatic {
    private SingletonMultithreadedStatic() {}

    private static class LazyHolder {
        static final SingletonMultithreadedStatic INSTANCE = new SingletonMultithreadedStatic();
    }

    public static SingletonMultithreadedStatic getInstance() {
        return LazyHolder.INSTANCE;
    }
}
