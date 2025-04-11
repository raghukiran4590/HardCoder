package designpatterns.structural.Facade;

public class Projector {

    public void turnOn() {
        System.out.println("Projector turned on");
    }

    public void setInput(String input) {
        System.out.println("Input set to "+input);
    }

}
