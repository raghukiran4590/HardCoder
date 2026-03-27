package concurrency;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            System.out.println("Runnable thru Executor Service");
            System.out.println(Thread.currentThread().getName());
        });

        Callable<String> call1 = () -> "call1 thread";

        Future<String> submit = executorService.submit(call1);
        String s = submit.get();
        System.out.println(s);
        executorService.shutdown();
    }
}
