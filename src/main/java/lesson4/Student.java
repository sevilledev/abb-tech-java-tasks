package lesson4;

public class Student {
    static String schoolName = "ABC University";

    String name;
    int age;
    int studentId;

    public static void call() {
        System.out.println(schoolName);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
