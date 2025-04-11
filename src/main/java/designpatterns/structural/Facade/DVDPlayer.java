package designpatterns.structural.Facade;

public class DVDPlayer {

    public void turnOn() {
        System.out.println("DVD Player turned on");
    }

    public void play(String movie) {
        System.out.println("Playing Movie "+movie);
    }

}
