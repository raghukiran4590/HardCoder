package lambdas.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
//    Predicate<T> takes an input, evaluates it and returns a boolean result.
//    Preciate can also be considered as a condition that can be used in filter() method.

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Predicate<Integer> predicate = (t) -> t%2==0;
        /*{
            if(t%2 == 0)
                return true;
            else
                return false;
        };*/
//        integerList.stream().forEach((t) -> System.out.println(predicate.test(t)));
//        System.out.println(predicate.test(9));
        integerList.stream().filter(predicate).forEach(System.out::println);
//        integerList.stream().filter(predicate).forEach(t-> System.out.println(predicate.test(t)));
    }
}
