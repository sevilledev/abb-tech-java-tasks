package lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int oldNum = num;

        while (num != 0) {
            int d = num % 10;
            int factorial = 1;

            for (int i = 1; i <= d; i++) {
                factorial *= i;
            }

            sum += factorial;
            num /= 10;
        }

        if (sum == oldNum) {
            System.out.println("The number is a Strong number.");
        } else {
            System.out.println("The number is not a Strong number.");
        }

        sc.close();
    }
}
