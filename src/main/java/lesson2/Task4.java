package lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String a = sc.nextLine();
        String reversed = new StringBuilder(a).reverse().toString();

        boolean isPalindrome = a.equals(reversed);

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) > a.charAt(i + 1)) isIncreasing = false;
            else if (a.charAt(i) < a.charAt(i + 1)) isDecreasing = false;
        }

        // I think polindrome cannot be increasing or decreasing that is why first check for it
        if (isPalindrome) {
            System.out.println("The number is a palindrome");
        } else if (isIncreasing) {
            System.out.println("Digits are in increasing order");
        } else if (isDecreasing) {
            System.out.println("Digits are in decreasing order");
        } else {
            System.out.println("Digits are neither in increasing nor decreasing order");
        }

        sc.close();
    }
}
