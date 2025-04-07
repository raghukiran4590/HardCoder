package designpatterns.creational.prototype;

public interface Shape extends Cloneable {
    Shape clone();
    void draw();
}

class Circle implements Shape {

    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {

    @Override
    public Shape clone() {
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}


