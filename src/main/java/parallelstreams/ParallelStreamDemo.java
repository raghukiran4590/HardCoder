package parallelstreams;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;

        startTime = System.currentTimeMillis();
        IntStream.range(0,100).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Regular Stream Time Taken : "+(endTime-startTime));

        System.out.println("---------------------------------------------------");

        startTime = System.currentTimeMillis();
        IntStream.range(0,100).parallel().forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken : "+(endTime-startTime));


    }
}
