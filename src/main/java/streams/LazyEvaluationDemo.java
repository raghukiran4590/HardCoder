package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Anna", "Bob", "Charlie", "David", "Mark");
        Stream<String> stringStream = namesList.stream().filter(name -> {
            System.out.println("Filtering "+name);
            return name.length() > 3;
        });

        System.out.println("Before Terminal Operation");
        List<String> collect = stringStream.collect(Collectors.toList());
        System.out.println("After Terminal Operation");
        System.out.println(collect);

    }
}
