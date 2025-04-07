package designpatterns.creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        UIFactory windowsUI = new WindowsUIFactory();
        windowsUI.createButton().Render();
        windowsUI.createCheckbox().Render();

        UIFactory macbookUI = new MacbookUIFactory();
        macbookUI.createButton().Render();
        macbookUI.createCheckbox().Render();


    }
}
