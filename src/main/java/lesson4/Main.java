package lesson4;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.studentId = 1001;

        System.out.println(Student.schoolName);

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.studentId = 1002;

        System.out.println(s2);
    }
}
