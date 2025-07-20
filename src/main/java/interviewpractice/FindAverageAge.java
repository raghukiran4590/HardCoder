package interviewpractice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindAverageAge {
    //Calculate the average age of a list of Person objects using Java streams
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        double avg = persons.stream().mapToInt(x -> x.age).average().orElse(0);
//        System.out.println(avg);

        double v = persons.stream().mapToInt(Person::getAge).average().orElse(-1);
//        System.out.println(v);

        Collectors.averagingDouble(Person::getAge).supplier();

        //Max age
        OptionalInt max = persons.stream().mapToInt(Person::getAge).max();
//        System.out.println(max.getAsInt());

        double v1 = persons.stream().mapToInt(x -> x.age).average().orElse(0);

        Collectors.averagingDouble(Person::getAge);


    }
}
