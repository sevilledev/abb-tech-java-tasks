package lesson2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        int oldA = a;
        int sum = 0;
        int count = Integer.toString(a).length();

        while (a != 0) {
            int d = a % 10;
            sum += (int) Math.pow(d, count);
            a /= 10;
        }

        if (sum == oldA) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        sc.close();
    }
}
