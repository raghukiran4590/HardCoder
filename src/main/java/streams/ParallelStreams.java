package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        //Enables Parallel processing
        //Allows Multiple threads to work on the stream simultaneously
        //Improves the performance
        //Workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(ParallelStreams::getFactorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken with sequential stream : "+(endTime - startTime));

        startTime = System.currentTimeMillis();
        factorialsList = list.parallelStream().map(ParallelStreams::getFactorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken with parallel stream : "+(endTime - startTime));

        //Cumulative Sum
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> list2 = list1.stream().map(sum::addAndGet).toList();
        System.out.println(list2);


    }

    public static long getFactorial(int n) {
        long result = 1;
        for(int i = 2; i<=n; i++) {
            result *= i;
        }
        return result;
    }
}
