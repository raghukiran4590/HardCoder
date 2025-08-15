package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService1 = Executors.newVirtualThreadPerTaskExecutor();
//        Future<?> return_virtual_thread_executor = executorService1.submit(() -> {
//            System.out.println("Return Virtual Thread Executor");
//        });
//        Object o = return_virtual_thread_executor.get();
//        String string = o.toString();
//        System.out.println(string);
        executorService.submit(() -> {
            System.out.println("Running Fixed Thread Pool Tasks");
        });

        executorService.shutdown();
//        executorService1.shutdown();
        System.out.println("Shutdown completed");
    }
}
