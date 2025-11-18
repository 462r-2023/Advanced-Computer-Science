public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructors
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters
    public String getCourseName() {
        return courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    // setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // inherited methods

    public String toString() {
        String s = "== " + courseName + " ==\n";
        for (int i = 0; i < enrolledStudents.length; i++) {
            s += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return s;
    }

    // methods

    /*
     * Iterates through the enrolledStudents array and returns the name of the student with the best
     * final average.
     * 
     * @return the name of the student with the best final average
     */
    // to-do: implement findBestStudent
    public String findBestStudent() {
        double best = Integer.MIN_VALUE;
        String bestName = "";
        for (StudentRecord student : enrolledStudents) {
            double finalAverage = student.getFinalAverage();
            if (finalAverage > best) {
                best = finalAverage;
                bestName = student.getName();
            }
        }
        return bestName;
    }

    /*
     * Iterates through the enrolledStudents array and returns the average of the specified test
     * number.
     * 
     * @return a double representing the average of the specified test number
     */
    // to-do: implement calculateTestAverage
    public double calculateTestAverage(int testNumber) {
        double sum = 0;
        for (StudentRecord student : enrolledStudents) {
            sum += student.getTestScore(testNumber);
        }
        return sum / enrolledStudents.length;
    }
}
