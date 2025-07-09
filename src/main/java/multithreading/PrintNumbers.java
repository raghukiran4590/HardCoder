package multithreading;

public class PrintNumbers extends Thread {

    private boolean isOddTurn = true;

    public synchronized void printOdd(int num) throws InterruptedException {
        while(!isOddTurn) {
            wait();
        }
        System.out.println("Thread-2 : "+num);
        isOddTurn = false;
        notify();
    }

    public synchronized void printEven(int num) throws InterruptedException {
        while(isOddTurn) {
            wait();
        }
        System.out.println("Thread-1 : "+num);
        isOddTurn = true;
        notify();
    }

    public static void main(String[] args) throws InterruptedException {

        PrintNumbers printNumbers = new PrintNumbers();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <=10 ; i++) {
                try {
                    printNumbers.printEven(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i <=10 ; i++) {
                try {
                    printNumbers.printOdd(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}
