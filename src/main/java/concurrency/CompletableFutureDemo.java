package concurrency;

import com.sun.tools.javac.Main;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()-> {
            System.out.println("RunAsync Object");
            System.out.println(Thread.currentThread().getName());
        });
        Thread.sleep(100);
        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            return "supplyAsSync Object";
        });
//        Thread.sleep(100);
//        stringCompletableFuture.complete("Completed");
        System.out.println(stringCompletableFuture.get());
        System.out.println("Main Thread Running");
    }
}
