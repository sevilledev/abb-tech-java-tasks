package lesson10;

public class NumberPrinterTask implements Runnable {
    String name;

    public NumberPrinterTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 80; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }
}
