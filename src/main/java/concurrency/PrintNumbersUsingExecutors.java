package concurrency;

import java.time.LocalTime;
import java.time.Period;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrintNumbersUsingExecutors {

    private boolean isEvenTurn = true;

    public synchronized void printOdd(int num) throws InterruptedException {
        while (isEvenTurn) {
            wait();
        }
        System.out.println("Runnable-2 : "+num);
        isEvenTurn = true;
        notify();
    }

    public synchronized void printEven(int num) throws InterruptedException {
        while (!isEvenTurn) {
            wait();
        }
        System.out.println("Runnable-1 : "+num);
        isEvenTurn = false;
        notify();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        PrintNumbersUsingExecutors printNumbersUsingExecutors = new PrintNumbersUsingExecutors();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();

        Future<String> future = executorService.submit(() -> {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    try {
                        printNumbersUsingExecutors.printEven(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    try {
                        printNumbersUsingExecutors.printOdd(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return "Executors Done";
        });

       while(!future.isDone()) {
//           System.out.println("Thread Pool Running");
       }

       if(future.isDone()) {
           System.out.println(future.get());
           executorService.shutdown();
       }

        long endtime = System.currentTimeMillis();
        System.out.println(Math.floorDiv(endtime - startTime, 1000));

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now());

/*
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        executorService1.submit(()-> {
            for (int i = 0; i <=10 ; i++) {
                if(i%2 == 0) {
                    try {
                        printNumbersUsingExecutors.printEven(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executorService2.submit(() -> {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    try {
                        printNumbersUsingExecutors.printOdd(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        executorService1.shutdown();
        executorService2.shutdown();*/

    }
}
