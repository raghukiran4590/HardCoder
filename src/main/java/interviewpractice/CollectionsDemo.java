package interviewpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        //Merge lists
        List<Integer> integerList = Stream.concat(list1.stream(), list2.stream()).toList();
        System.out.println(integerList);

        //Intersection of Lists
        List<Integer> integerList1 = list1.stream().filter(list2::contains).toList();
        System.out.println(integerList1);

        //


    }
}
