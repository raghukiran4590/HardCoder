package designpatterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        RectangleAdapter rectangleAdapter = new RectangleAdapter(rectangle);
        rectangleAdapter.draw();
    }
}
