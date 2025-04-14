package dsa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindIntersection {

    // Find common numbers in two strings in a string array

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(FindIntersection(new String[]{"1,3,4,5,13", "1,2,4,13,15"}));
        String[] strArr = new String[]{"1,3,4,5,13", "1,2,4,13,15"};
        int counter =0;
        String[] str1 = strArr[0].split(",");
        String[] str2 = strArr[1].split(",");
        String result = "";
        for(int i=0; i<str1.length; i++) {
            for(int j=0; j<str2.length; j++) {
                if(str1[i].equalsIgnoreCase(str2[j])) {
                    counter++;
                    result = result + str2[j] + ",";
//                    result.append(str2[j]).append(",");
                }
            }
        }
        if(counter>0)
            System.out.println(result.substring(0,result.length()-1));
        else
            System.out.println("false");
    }
}
