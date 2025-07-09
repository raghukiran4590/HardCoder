package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalStreamsOps {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        //Collect
        List<Integer> integerList = list.stream().skip(1).collect(Collectors.toList());
        List<Integer> integerList2 = list.stream().skip(2).toList();
        System.out.println(integerList);
        System.out.println(integerList2);

        //Count
        long cnt = list.stream().skip(2).count();
        System.out.println(cnt);

        //ForEach
        list.stream().forEach(System.out::println);

        //forEachOrdered in case of parallel stream
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("forEach print");
        list2.parallelStream().forEach(System.out::print);
        System.out.println("forEachOrdered print");
        list2.parallelStream().forEachOrdered(System.out::print);

        //Reduce
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        //toArray
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        Object[] listToArray = list1.toArray();

        //Min/Match
        System.out.println(Stream.of(1,45,67,24,66,88,74).min(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(1,45,67,24,66,88,74).max(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(1,45,67,24,66,88,74).min((a, b)-> b-a).get());

        //Short Circuit Methods
        //anyMatch, allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        //findFirst, findAny
        Optional<Integer> first = list.stream().findFirst();
        System.out.println(first.get());
        Optional<Integer> any = list.stream().findAny();
        System.out.println(any);

        //Examples
        //Filtering and Collecting Names
        List<String> namesList = Arrays.asList("Anna", "Bob", "Charlie", "David", "Mark");
        List<String> collect = namesList.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.println(collect);

        //Squaring and sorting Numbers
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> collect1 = numbersList.stream().map(x -> x * x).sorted().collect(Collectors.toList());
        System.out.println(collect1);

        //Summing Values
        List<Integer> numbersList2 = Arrays.asList(1,2,3,4,5,6,7);
        Optional<Integer> reduce1 = numbersList2.stream().reduce(Integer::sum);
        System.out.println(reduce1.get());

        //Count occurrences of a character
        String sentence = "Hello World";
        long count = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count);


        //Stream cannot be reused after a terminal operation has been called


        //Stateful and Stateless





    }
}
