package collections;

import java.util.*;
import java.util.function.DoubleToIntFunction;
import java.util.stream.IntStream;

public class ArrayListDemo {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        IntStream sorted = Arrays.stream(arr).sorted();
//        System.out.println(sorted);
        sorted.forEach(System.out::print);

        List<Integer> list = new ArrayList<>();
        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Collections.addAll(list, integers);
//        System.out.println(list);

//        list.sort(null);

//        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);

//        list.sort((a,b)-> b-a);
//        System.out.println(list);

        /*Collections.sort(list, (a,b)-> a-b);
        System.out.println(list);*/

        list.sort(Comparator.reverseOrder());
//        System.out.println(list);

        list.sort(Comparator.comparing(Integer::intValue).reversed());
//        System.out.println(list);

        list.sort(Integer::compareTo);
//        System.out.println(list);

       /* Collections.sort(list, Comparator.comparing(Integer::intValue).reversed());
        list.sort((a,b)-> a-b);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });*/
    }

}
