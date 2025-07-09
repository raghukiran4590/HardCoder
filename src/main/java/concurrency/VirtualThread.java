package concurrency;

import java.util.List;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> {
            System.out.println("Running Fixed Thread Pool Tasks");
        });

        Stack<String> list = new Stack<>();
        list.push("Kiran");
        System.out.println(list.peek());
        executorService.shutdown();
        System.out.println("Shutdown completed");
    }
}
