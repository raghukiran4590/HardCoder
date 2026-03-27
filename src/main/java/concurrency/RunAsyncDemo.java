package concurrency;

import java.util.concurrent.CompletableFuture;

public class RunAsyncDemo {
    public static void main(String[] args) {
        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    try {
                        Thread.currentThread().wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });

        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(() -> {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        });

    }
}
