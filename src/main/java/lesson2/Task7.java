package lesson2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        long factorial = 1; // it can be a big number

        if (num < 0) {
            System.out.println("Factorial does not exist for negative numbers");
            return;
        }

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);

        sc.close();
    }
}
