package concurrency;

import java.util.concurrent.Callable;

public class ThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Running thread : "+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
            System.out.println("thread "+Thread.currentThread().getName()+" is awake now");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
            ThreadExample threadExample = new ThreadExample();
            threadExample.start();
    }
}
