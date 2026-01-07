package lesson3;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, -2, 15, 0, 99, -100};

        int max = numbers[0];
        int min = numbers[0];

        for (int i : numbers) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
