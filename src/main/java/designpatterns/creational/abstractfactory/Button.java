package designpatterns.creational.abstractfactory;

public interface Button {
    void Render();

}

class MacbookButton implements Button{
    @Override
    public void Render() {
        System.out.println("Macbook Button");
    }
}

class WindowsButton implements Button{
    @Override
    public void Render() {
        System.out.println("Windows Button");
    }
}
