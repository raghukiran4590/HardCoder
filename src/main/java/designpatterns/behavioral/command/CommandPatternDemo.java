package designpatterns.behavioral.command;

// Client code
public class CommandPatternDemo {
    public static void main(String[] args) {
        // Create the receiver
        Light light = new Light();

        // Create the concrete commands
        Command turnOnCommand = new LightOnCommand(light);
        Command turnOffCommand = new LightOffCommand(light);

        // Create the invoker
        RemoteControl remoteControl = new RemoteControl();

        // Set the commands
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton(); // Light is ON

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton(); // Light is OFF
    }
}
// Output:
// Light is ON
// Light is OFF