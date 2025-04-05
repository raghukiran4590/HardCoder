package designpatterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;
// Step 4: Implement the Observers
public class ConcreteObserver implements Observer {
    private String name;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.attach( this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observer " + name + " notified. New state is: " + subject.getState());
    }
}
