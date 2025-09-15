import java.util.Random;

public class Student {
    private String name, id;
    private int grade;

    public Student(String name) {
        this.name = name;
        grade = 10;
        id = generateId();
    }

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        id = generateId();
    }

    public String generateId() {
        String s = "";
        Random r = new Random();
        for (int i = 0; i < 7; i++) {
            s += r.nextInt(10);
            if (i == 2)
                s += "-";
        }
        return s;
    }

    public String toString() {
        return name + " is a " + grade + "th grade student. Their id is " + id + ".";
    }

    public boolean equals(Student other) {
        return name.equals(other.name) && grade == other.grade && id.equals(other.id);
    }
}
