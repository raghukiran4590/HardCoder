package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateStreamOps {

    public static void main(String[] args) {

        //Intermediate operations transform a stream into another stream
        //They are lazy, meaning they don't execute until a terminal operation is invoked

        List<String> list = Arrays.asList("Askhit", "Ram", "Ram", "Shyam", "Kiran");
        //Filter
        long count = list.stream().filter(x -> x.startsWith("R")).count();
        System.out.println(count);

        //Map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

         //Sorted
        Stream<String> sorted1 = list.stream().sorted();
        Stream<String> sorted2 = list.stream().sorted((a, b) -> a.length() - b.length());

        //Distinct
        System.out.println(list.stream().filter(x -> x.startsWith("R")).distinct().count());

        //Limit
        System.out.println(Stream.iterate(1,x->x+1).limit(10).count());

        //Skip
        System.out.println(Stream.iterate(1,x->x+1).skip(2).limit(10).count());

        //Peek(Same as forEach operation but this is not terminal operation like forEach
        //Used if we need to do any for operation before terminating the stream.
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        list1.stream().peek(System.out::println).count();

        //flatMap
        //Transform and flatten the elements at the same time
        List<List<String>> fruits = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grapes")
        );
        System.out.println(fruits.get(1).get(1));
        List<String> list2 = fruits.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
        System.out.println(list2);


        List<String> list3 = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );

        List<String> list4 = list3.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(String::toUpperCase).toList();
        System.out.println(list4);
    }
}
