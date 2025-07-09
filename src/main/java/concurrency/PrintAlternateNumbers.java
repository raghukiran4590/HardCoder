package concurrency;

public class PrintAlternateNumbers extends Thread {

    private boolean isOddTurn = true;

    public synchronized void printEven(int num) throws InterruptedException {
//        System.out.println("printEven Synchronized Block");
        while (isOddTurn) {
            wait();
        }
        System.out.println("Thread-1 number : " + num);
        isOddTurn = true;
        notify();
    }

    public synchronized void printOdd(int num) throws InterruptedException {
//        System.out.println("printOdd Synchronized Block");
        while (!isOddTurn) {
            wait();
        }
        System.out.println("Thread-2 number : " + num);
        isOddTurn = false;
        notify();
    }

    public static void main(String[] args) {

//        System.out.println("Starting.....");
        PrintAlternateNumbers printAlternateNumbers = new PrintAlternateNumbers();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    printAlternateNumbers.printEven(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                try {
                    printAlternateNumbers.printOdd(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
