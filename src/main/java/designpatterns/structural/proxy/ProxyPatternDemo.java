package designpatterns.structural.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("test_image.png");
        proxyImage.display();
        proxyImage.display();
    }
}
