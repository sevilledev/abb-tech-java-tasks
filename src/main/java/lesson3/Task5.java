package lesson3;

public class Task5 {
    public static void main(String[] args) {
        String str = "OpenAI";
        StringBuilder rev = new StringBuilder();

        int len = str.length();

        for (int i = 0; i < len; i++) {
           rev.append(str.charAt(len - 1 - i));
        }

        System.out.println("Reversed string: " + rev);
    }
}
