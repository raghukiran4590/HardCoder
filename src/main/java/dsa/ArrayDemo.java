package dsa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6, 11, -6};
        //Sum of elements in an Array
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        //Max element using max() method
        int max = Arrays.stream(arr).max().getAsInt();
//        System.out.println(max);

//      Max Element using Reduce Method
        int reduce = Arrays.stream(arr).reduce((a, b) -> {
            if(a > b)
                return a;
            else
                return b;
        }).getAsInt();

//        System.out.println(reduce);

        List<Integer> list = Arrays.stream(arr).boxed().toList();

//        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(list);

        Collections.reverse(list1);

//        System.out.println(list1);

        int i = 0;
        int j = arr.length-1;
        int temp = 0;

        while(i<j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k = 0; k< arr.length; k++) {
            System.out.print(arr[k] + " ");
        }



    }
}
