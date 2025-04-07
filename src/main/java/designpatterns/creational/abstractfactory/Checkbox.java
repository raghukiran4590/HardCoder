package designpatterns.creational.abstractfactory;

public interface Checkbox {
    void Render();
}

class WindowsCheckbox implements Checkbox {

    @Override
    public void Render() {
        System.out.println("Windows Checkbox");
    }
}

class MacbookCheckbox implements Checkbox {

    @Override
    public void Render() {
        System.out.println("Macbook Checkbox");
    }
}
