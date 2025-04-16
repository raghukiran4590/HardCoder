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

        // anyMatch, allMatch, noneMatch


    }
}
