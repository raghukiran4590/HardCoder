package designpatterns.structural.proxy;

public class RealImage implements Image {
    private String name;

    public RealImage(String name) {
        this.name = name;
        loadFromDisk();
    }

    public void loadFromDisk() {
        System.out.println("Loading "+name);
    }

    @Override
    public void display() {
        System.out.println("Displaying : "+name);
    }
}
