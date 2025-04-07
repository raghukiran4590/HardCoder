package designpatterns.creational.singleton;

public class LazyInitializing {
    private static LazyInitializing lazyInitializing;

    private LazyInitializing() {}

    public static LazyInitializing getInstance() {
        if(lazyInitializing == null) {
            lazyInitializing = new LazyInitializing();
        }
        return lazyInitializing;
    }
}
