package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,6,6,7,8,8,9,10};
//        for(int i: arr) {
//            System.out.print(i);
//        }\
        List<Integer> asList = Arrays.stream(arr).boxed().toList();
        System.out.println(asList);
        Set<Integer> integerSet = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(integerSet);
        List<Integer> integerList = Arrays.stream(arr).boxed().distinct().toList();
        System.out.println(integerList);
        asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> {
                    if(v == 1)
                        System.out.print(k + " ");
                });
//        Map<Integer, Long> integerLongMap = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(integerLongMap.entrySet());
        asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}
