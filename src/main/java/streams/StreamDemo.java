package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        //Feature introduced in Java 8
        //Process collections of data in a functional and declarative manner
        //Simplify Data Processing
        //Embrace Functional Programming
        //Improve Readability and Maintainability
        //Enable Easy Parallelism

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numbers.stream().filter(x->x%2==0).count());

        //Ways to create stream
        String[] array = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(array);

        Stream<String> stringStream = Stream.of("a", "b", "c");

//        Stream.generate(()->1);
        List<Integer> collectList2 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collectList2);

    }
}
