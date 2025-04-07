package designpatterns.creational.prototype;

public class Client {

    public static void main(String[] args) {
        Shape circlePrototype = new Circle();
        Shape rectanglePrototype = new Rectangle();

        Shape clonedCircle = circlePrototype.clone();
        Shape clonedRectangle = rectanglePrototype.clone();

        clonedCircle.draw();
        clonedRectangle.draw();

    }
}
