package designpatterns.creational.factorymethod;

public interface Animal {
    void makeNoise();
}

class Cat implements Animal {

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}

class Dog implements Animal {

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
}
