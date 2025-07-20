package interviewpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestString {
    public static void main(String[] args) {
        //Find the longest string in a list of strings using Java streams
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        int max = 0;

        Optional<String> max1 = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max1.get());

        Optional<String> max2 = strings.stream().max(Comparator.comparingInt(String::length));
        String maxNone = max2.orElse("none");
    }
}
