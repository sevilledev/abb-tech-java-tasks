package lesson3;

public class Task7 {
    public static void main(String[] args) {
        String sentence = "Java is awesome";
        int[] counts = new int[128];

        for (int i : sentence.toCharArray()) {
            counts[i]++;
        }

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0 && i != ' ') {
                System.out.println((char) i + " - " + counts[i]);
            }
        }
    }
}
