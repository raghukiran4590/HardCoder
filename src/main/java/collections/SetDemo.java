package collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> dbs = Stream.of("apple", "banana", "mango", "apple").collect(Collectors.toSet());
        System.out.println(dbs);
        System.out.println(new Date().toString());
        System.out.println(LocalDate.now() + " " +LocalTime.now());
        System.out.println(LocalTime.now());
    }
}
