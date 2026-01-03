package lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); // for getting rid of the '\n' after nextInt()
        System.out.println("Enter your gender (M or F): ");
        String gender = sc.nextLine().trim().toUpperCase(); // good practice to normalize input

        if (age < 18) System.out.println("Access denied");
        else {
            if (gender.equals("M")) System.out.println("Male access granted");
            else if (gender.equals("F")) System.out.println("Female access granted");
            else System.out.println("Invalid gender entered");
        }

        sc.close();
    }
}
