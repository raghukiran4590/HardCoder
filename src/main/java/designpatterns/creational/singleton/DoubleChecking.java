package designpatterns.creational.singleton;

public class DoubleChecking {
    private static DoubleChecking doubleChecking;

    private DoubleChecking() {}

    public static DoubleChecking getInstance() {
        if(doubleChecking == null) {
            synchronized (DoubleChecking.class) {
                if(doubleChecking == null) {
                    doubleChecking = new DoubleChecking();
                }
            }
        }
        return doubleChecking;
    }
}
