package lesson10;

import java.util.Scanner;

public class IntSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nPlease enter an integer: ");
                int a = sc.nextInt();

                System.out.println("Valid integer and its square: " + a * a);
                break;
            } catch (Exception e) {
                System.out.println("Input is not an integer.");
                sc.nextLine(); // Clear the invalid input
            }
        }

        sc.close();
    }
}
