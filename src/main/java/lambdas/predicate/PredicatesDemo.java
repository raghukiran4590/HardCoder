package lambdas.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PredicatesDemo {

    public static void main(String[] args) {

        //Predicates
        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));

        Predicate<String> isWordStartingWithA = s -> s.toUpperCase().startsWith("A");
        Predicate<String> isWordEndingWithN = s -> s.toUpperCase().endsWith("N");
        Predicate<String> checkBothConditions = isWordStartingWithA.and(isWordEndingWithN);
        Predicate<String> orCheck = isWordStartingWithA.or(isWordEndingWithN);
        boolean hello = "Hello".equals("Hello");
        Predicate<String> negate = isWordStartingWithA.negate(); // -> !isWordStartingWithA

        System.out.println(isWordStartingWithA.test("Akash"));
        System.out.println(isWordEndingWithN.test("Kiran"));
        System.out.println(checkBothConditions.test("Anton"));

        //Functions
        Function<Integer, Integer> doubletIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;

        Integer doubleResult = doubletIt.apply(20);
        Integer tripleResult = tripleIt.apply(30);
        System.out.println(doubleResult);
        System.out.println(tripleResult);

        Integer finalResult = doubletIt.andThen(tripleIt).apply(10);
        System.out.println(finalResult);

        Integer applyReverse = tripleIt.compose(doubletIt).apply(10);
        System.out.println(applyReverse);

        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(50);
        System.out.println(res);

        //Consumer
        Consumer<Integer> print = (x) -> System.out.println(x);
        print.accept(5);

        Consumer<List<Integer>> printList = x -> {
            for(int i : x) {
                System.out.print(i);
            }
        };

        printList.accept(Arrays.asList(1,2,3,4,5));

        //Supplier
        Supplier<String> giveMessage = ()-> "Hello World";
        String s = giveMessage.get();
        System.out.println(s);

        //Combined Example
        Predicate<Integer> predicate = (x) -> x%2 == 0;
        Function<Integer, Integer> function = (x) -> x * x;
        Consumer<Integer> consumer = System.out::println;
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())) {
            consumer.accept(function.apply((supplier.get())));
        }

        //BiPredicate, BiConsumer, BiFunction
        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y) %2 == 0;
        System.out.println(isSumEven.test(5,5));
        BiConsumer<Integer, String> biConsumer = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> biFunction = (x,y)->(x+y).length();
        System.out.println(biFunction.apply("abc", "def"));

        //Unary Operator
        UnaryOperator<Integer> unaryOperator = (x) -> x*10;
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;



    }
}
