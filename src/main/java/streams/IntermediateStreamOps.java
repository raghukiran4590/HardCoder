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

    }
}
