package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int score = 81;
//
//        if (score >= 91) {
//            System.out.println("Grade: A");
//        } else if (score >= 81) {
//            System.out.println("Grade: B");
//        } else if (score >= 71) {
//            System.out.println("Grade: C");
//        } else if (score >= 61) {
//            System.out.println("Grade: D");
//        } else {
//            System.out.println("Grade: F");
//        }

//        Scanner sc1 = new Scanner(System.in);
//        String s = sc1.nextLine();
//
//        switch (s) {
//            case "A":
//                System.out.println("Between 91 and 100");
//                break;
//            case "B":
//                System.out.println("Between 81 and 90");
//                break;
//            case "C":
//                System.out.println("Between 71 and 80");
//                break;
//            case "D":
//                System.out.println("Between 61 and 70");
//                break;
//            case "F":
//                System.out.println("Under 61");
//                break;
//            default:
//                System.out.println("Invalid grade");
//        }

//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        String result = (age < 18) ? "Age is not enough" : "Age is enough";
//        System.out.println(result);

        Scanner sc2 = new Scanner(System.in);
//        int num = sc2.nextInt();
        int a = sc2.nextInt();
        int b = sc2.nextInt();
        int sum = 0;

//        int i = 0;
//        while (i <= num) {
//            if (i % 2 == 0) System.out.println(i);
//            i++;
//        }

//        for (int j = 0; j <= num; j++) {
//            if (j % 2 == 1) System.out.println(j);
//        }

        for (int k = a; k <= a + b; k++) {
            System.out.println(k);
            sum += k;
        }

        System.out.println(sum);


    }
}
