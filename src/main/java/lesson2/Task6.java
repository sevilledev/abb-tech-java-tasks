package lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a count: ");
        int count = sc.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a valid number");
            return;
        }

        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(a + (a % 2 == 0 ? " even" : " odd"));
            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
