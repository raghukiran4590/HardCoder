package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

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

        //Reduce
        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

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

        //Stateful and Stateless



    }
}
