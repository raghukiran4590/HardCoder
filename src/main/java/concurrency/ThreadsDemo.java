package concurrency;

import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadsDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running");
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ThreadsDemo threadsDemo = new ThreadsDemo();
        threadsDemo.setName("t1");
        threadsDemo.start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable1 started");
            }
        };

        runnable1.run();

        Runnable runnable2 = () -> {
            System.out.println("Runnable2 started");
        };

        runnable2.run();

        Callable<Integer> callable1 = () -> {
            return IntStream.range(1,100).sum();
        };

        Callable<Integer> callable2 = () -> {
            return IntStream.range(101,200).sum();
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Callable<Integer>> callableList = Arrays.asList(callable1,callable2);

        List<Future<Integer>> futureList = executorService.invokeAll(callableList);

        AtomicInteger atomicInteger = new AtomicInteger();

        executorService.invokeAll(callableList).stream().map(integerFuture -> {
            try {
                return integerFuture.get();
            }catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).forEach(number -> {
            System.out.println("Sum of Callable "+atomicInteger.incrementAndGet()+" -> "+number);
        });

//        for(Future future: futureList) {
//            System.out.println(future.get());
//        }

        executorService.shutdown();
    }
}
