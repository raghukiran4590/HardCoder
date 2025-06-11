package basic;

public abstract class AbstractExample {
    String message;

    public AbstractExample(String message) {
        this.message = message;
    }

    abstract void printMessage(String message);

}

class ChildAbstract extends AbstractExample {

    public ChildAbstract(String message) {
        super(message);
//        System.out.println(this.message);
    }

    @Override
    void printMessage(String message) {
        System.out.printf("Message : "+message);
    }

    public static void main(String[] args) {
        ChildAbstract childAbstract = new ChildAbstract("Hello");
        childAbstract.printMessage(childAbstract.message);
    }
}
