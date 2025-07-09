package concurrency;

public class PrintAlternateDigits {

    private boolean isEvenTurn = true;

    public synchronized void printOdd(int num) throws InterruptedException {
        while (isEvenTurn) {
            wait();
        }
        System.out.println("Thread-2 : "+num);
        isEvenTurn = true;
        notify();
    }

    public synchronized void printEven(int num) throws InterruptedException {
        while (!isEvenTurn) {
            wait();
        }
        System.out.println("Thread-1 : "+num);
        isEvenTurn = false;
        notify();
    }

    public static void main(String[] args) {

        PrintAlternateDigits printAlternateDigits = new PrintAlternateDigits();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <=10 ; i++) {
                if(i%2 == 0) {
                    try {
                        printAlternateDigits.printEven(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <=10 ; i++) {
                if(i%2 != 0) {
                    try {
                        printAlternateDigits.printOdd(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
