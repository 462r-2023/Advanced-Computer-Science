public class CourseTester {
    public static void main(String[] args) {
        StudentRecord ana = new StudentRecord("Ana", new int[] {90, 89, 91, 95});
        System.out.println(ana.toString());
        System.out.println("Ana's average: " + ana.getAverage(0, 3));
        System.out.println("Ana's second test score: " + ana.getTestScore(1));
    }
}
