package designpatterns.creational.singleton;

public class EagerInitializing {
    private static final EagerInitializing eagerInitializing = new EagerInitializing();

    private EagerInitializing() {}

    private static EagerInitializing getInstance() {
        return eagerInitializing;
    }
}
