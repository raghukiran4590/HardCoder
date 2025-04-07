package designpatterns.creational.abstractfactory;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class MacbookUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new MacbookButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacbookCheckbox();
    }
}
