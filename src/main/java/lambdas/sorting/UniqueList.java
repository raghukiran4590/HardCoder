package lambdas.sorting;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,1,2,3);
        System.out.println(list);
        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);

        List<Integer> integerList = list.stream().distinct().toList();
        System.out.println(integerList);


    }
}
