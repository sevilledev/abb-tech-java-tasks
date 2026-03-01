package lesson9;

import java.io.*;

public class StudentFileHandler {
    public static final String FILE_PATH = "src/main/java/lesson9/students.txt";

    public static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");

                if (words.length == 3) {
                    Student student = new Student(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]));
                    System.out.println(student);
                }
                else System.out.println("Invalid line format");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(Student student) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.newLine();
            bw.write(student.toFileString());
            System.out.println("\nStudent information written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
