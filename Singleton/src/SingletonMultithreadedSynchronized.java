public class SingletonMultithreadedSynchronized {
    private static SingletonMultithreadedSynchronized singletonInstance = null;

    private SingletonMultithreadedSynchronized() {
    }

    public static synchronized SingletonMultithreadedSynchronized getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new SingletonMultithreadedSynchronized();
        }
            return singletonInstance;
    }
}
