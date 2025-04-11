package designpatterns.structural.Facade;

public class FacadePatternDemo {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer, amplifier, projector);
        homeTheatreFacade.watchMovie("Terminator");
    }
}
