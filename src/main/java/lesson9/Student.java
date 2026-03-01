package lesson9;

public class Student {
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentID: " + id + ", Name: " + name + ", Score: " + score;
    }

    public String toFileString() {
        return id + "," + name + "," + score;
    }
}
