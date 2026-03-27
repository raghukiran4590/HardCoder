package concurrency;

public class AlternateThreads {
    public boolean isOdd = false;

    public synchronized void printOddNumbers(int num) throws InterruptedException {
        while(!isOdd) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() + "->" + num);
        isOdd = false;
        notify();
    }

    public synchronized void printEvenNumbers(int num) throws InterruptedException {
        while(isOdd) {
            wait();
        }
        System.out.println(Thread.currentThread().getName() + "->" + num);
        isOdd = true;
        notify();
    }

    public static void main(String[] args) {

        AlternateThreads alternateThreads = new AlternateThreads();

        Runnable r1 = () -> {
            for(int i = 0; i<=10; i++) {
                if (i%2 == 0) {
                    try {
                        alternateThreads.printEvenNumbers(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable r2 = () -> {
            for(int i = 0; i<=10; i++) {
                if (i%2 != 0) {
                    try {
                        alternateThreads.printOddNumbers(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
