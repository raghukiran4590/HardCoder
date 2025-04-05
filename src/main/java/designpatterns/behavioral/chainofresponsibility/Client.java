package designpatterns.behavioral.chainofresponsibility;

// Client
public class Client {
    public static void main(String[] args) {
        Handler handler3 = new ConcreteHandler3();
        Handler handler2 = new ConcreteHandler2();
        Handler handler1 = new ConcreteHandler1();

        // Building the chain
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        // Starting the request chain
        handler1.handleRequest("request1");
        handler1.handleRequest("request2");
        handler1.handleRequest("request3");
    }
// Output:
// ConcreteHandler1 is handling the request
// ConcreteHandler2 is handling the request
// ConcreteHandler3 is handling the request
}