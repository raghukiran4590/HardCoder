package designpatterns.structural.proxy;

public class ProxyImage implements Image {
    private String name;
    private RealImage realImage;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(name);
        }
        realImage.display();
    }
}
