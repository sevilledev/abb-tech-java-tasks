package lesson1;

public class StudentProfile {
    public static void main(String[] args) {
        // Variable Declaration and Initialization
        int age = 20;
        double height = 1.70;
        boolean isStudent = true;

        // Print Variables
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is student: " + isStudent);


        // Implicit Type Casting
        int points = 85;
        double pointsDouble = points;
        System.out.println("Points (int) " + points);
        System.out.println("Points (double) " + pointsDouble);


        // Explicit Type Casting
        double averageScore = 92.7;
        int finalScore = (int) averageScore;
        System.out.println("Average score: " + averageScore);
        System.out.println("Final score: " + finalScore);
    }
}
