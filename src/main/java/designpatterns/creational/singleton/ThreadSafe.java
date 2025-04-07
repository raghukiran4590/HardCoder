package designpatterns.creational.singleton;

public class ThreadSafe {

    private static ThreadSafe threadSafe;

    private ThreadSafe() {}

    public static synchronized ThreadSafe getInstance() {
        if(threadSafe == null) {
            threadSafe = new ThreadSafe();
        }
        return threadSafe;
    }
}
