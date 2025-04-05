package designpatterns.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        // Use Addition Strategy
        context.setStrategy(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // Use Subtraction Strategy
        context.setStrategy(new SubtractionStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // Use Multiplication Strategy
        context.setStrategy(new MultiplicationStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

