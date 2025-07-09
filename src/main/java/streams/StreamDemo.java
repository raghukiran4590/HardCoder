package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
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

        Predicate<Integer> moreThanEqual3 = x-> x>=3;
        Predicate<Integer> lessThanEqual6 = x-> x<=6;

        List<Integer> integerList = numbers.stream().filter(moreThanEqual3.and(lessThanEqual6)).toList();
        System.out.println(integerList);

        //Ways to create stream
        String[] array = {"a", "b", "c"};
        Stream<String> stream = Arrays.stream(array);

        Stream<String> stringStream = Stream.of("a", "b", "c");

//        Stream.generate(()->1);
        List<Integer> collectList2 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collectList2);

        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        String sentence = "Hello World";
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);


    }
}
