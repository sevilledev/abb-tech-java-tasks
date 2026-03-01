package lesson10;

public class TwoThreadExp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinterTask("Thread 1"));
        Thread t2 = new Thread(new NumberPrinterTask("Thread 2"));

        t1.start();
        t2.start();
    }
}
