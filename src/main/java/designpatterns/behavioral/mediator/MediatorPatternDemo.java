package designpatterns.behavioral.mediator;

// Example Usage
public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser(mediator, "User1");
        User user2 = new ChatUser(mediator, "User2");
        User user3 = new ChatUser(mediator, "User3");
        User user4 = new ChatUser(mediator, "User4");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi everyone!");
        user3.send("Hello User1!");

//        Output:
//        User1: Sending Message = Hi everyone!
//        User2: Received Message = Hi everyone!
//        User3: Received Message = Hi everyone!
//        User4: Received Message = Hi everyone!
//        User3: Sending Message = Hello User1!
//        User1: Received Message = Hello User1!
//        User2: Received Message = Hello User1!
//        User4: Received Message = Hello User1!
    }
}
