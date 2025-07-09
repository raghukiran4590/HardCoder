package concurrency;

public class RunnableDemo extends Thread {

    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Runnable runnable = new RunnableDemo();
        Thread myThread = new Thread(runnable);
        myThread.start();

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
