package designpatterns.behavioral.chainofresponsibility;

// Handler interface
interface Handler {
    void handleRequest(String request);
    void setSuccessor(Handler successor);
}

// Base handler class
abstract class AbstractHandler implements Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

// Concrete handlers
class ConcreteHandler1 extends AbstractHandler {
    public void handleRequest(String request) {
        if (request.equals("request1")) {
            System.out.println("ConcreteHandler1 is handling the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandler2 extends AbstractHandler {
    public void handleRequest(String request) {
        if (request.equals("request2")) {
            System.out.println("ConcreteHandler2 is handling the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

class ConcreteHandler3 extends AbstractHandler {
    public void handleRequest(String request) {
        if (request.equals("request3")) {
            System.out.println("ConcreteHandler3 is handling the request");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
