package lesson10;

import java.util.Scanner;

public class InputRangeValidator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter an age between 18 and 40: ");
            int age = sc.nextInt();
            validateAge(age);
            System.out.println("Valid age entered: " + age);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input type.");
        }
    }

    public static void validateAge(int age) throws InvalidInputException {
        if (age < 18 || age > 40) throw new InvalidInputException("Age must be between 18 and 40");
    }
}
