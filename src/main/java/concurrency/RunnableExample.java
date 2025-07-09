package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread running : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
            Thread thread = new Thread(()-> {
                System.out.println("Test Runnable Thread "+ Thread.currentThread().getName());
            });
            thread.start();

            RunnableExample runnableExample = new RunnableExample();
        Thread thread1 = new Thread(runnableExample);
        thread1.start();
    }
}
