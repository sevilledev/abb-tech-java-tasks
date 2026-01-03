package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // More clean way
        for (int j = 1; j <= num; j += 2) {
            System.out.println(j);
        }

        sc.close();
    }
}
