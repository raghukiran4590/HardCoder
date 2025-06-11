package basic;

import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public interface InterfaceExample {

    static void print() {
        System.out.println("Interface Static Method");
    }

    default void display() {
        System.out.println("Interface Default Method");
    }

    void add(int a, int b);
}

class TestInterface implements InterfaceExample {

    @Override
    public void add(int a, int b) {
        System.out.println("Sum : "+(a+b));
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.display();
        testInterface.add(2,3);
        InterfaceExample.print();
    }
}
