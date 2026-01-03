package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("Zero");
        } else if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        sc.close();
    }
}
