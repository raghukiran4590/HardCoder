package designpatterns.behavioral.strategy;

public interface Strategy {
    int execute(int a, int b);
}

// Step 2: Implement Concrete Strategies
class AdditionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class SubtractionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

class MultiplicationStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

// Step 3: Define the Context Class
class Context {
    private Strategy strategy;

    // Method to set the strategy at runtime
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method to execute the strategy
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

