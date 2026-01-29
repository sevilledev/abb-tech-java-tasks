package lesson8;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 100).parallel().forEach(i -> {
            System.out.println("Thread " + Thread.currentThread().getName());
        });
    }
}
