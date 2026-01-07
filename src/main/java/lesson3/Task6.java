package lesson3;

public class Task6 {
    public static void main(String[] args) {
        String str = "madam";
        int len = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
    }
}
