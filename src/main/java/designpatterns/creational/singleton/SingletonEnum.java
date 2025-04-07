package designpatterns.creational.singleton;

public enum SingletonEnum {
    INSTANCE;

    public void showMessage() {
        System.out.println("Hello from Singleton Enum");
    }

    public static void main(String[] args) {
        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        singletonEnum1.showMessage();

        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        singletonEnum2.showMessage();

        System.out.println("Are both instances same ? " + (singletonEnum1 == singletonEnum2));

    }
}
