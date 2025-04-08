package lambdas;

public class Expression {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Lambda Expression");
        };
        runnable.run();

        // Consumer<T>: Takes input returns result
        // Predicate<T> : Returns true/false
        // Supplier<T> : No input, returns result
    }
}
