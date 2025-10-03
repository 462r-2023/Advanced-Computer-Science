public class StudentTester {

    public static void main(String[] args) {
        // Make students
        Student student1 = new Student("Boyan", 10);
        Student student2 = new Student("Ivan", 6);
        Student student3 = new Student("Bob");
        Student student4 = new Student("Joe");

        // Print all students
        System.out.println("Student1: " + student1.toString());
        System.out.println("Student2: " + student2.toString());
        System.out.println("Student3: " + student3.toString());
        System.out.println("Student4: " + student4.toString());

        // Graduation
        student1.setGrade(student1.getGrade() + 1);
        student2.setGrade(student2.getGrade() + 1);
        student3.setGrade(student3.getGrade() + 1);
        student4.setGrade(student4.getGrade() + 1);

        // Print all students again
        System.out.println("Student1: " + student1.toString());
        System.out.println("Student2: " + student2.toString());
        System.out.println("Student3: " + student3.toString());
        System.out.println("Student4: " + student4.toString());

        // Compare two students
        System.err.println("Does Student1 equal Student3: " + student1.equals(student3));
    }

}
