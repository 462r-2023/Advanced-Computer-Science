public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 6);
        Rectangle r2 = new Rectangle(3, 5);

        System.out.println("First rectangle: " + r1);
        System.out.println("Second rectangle: " + r2);

        r1.setLength(4);
        System.out.println("Set first rectangle length to 4");
        r1.setWidth(10);
        System.out.println("Set first rectangle width to 10");
        r2.setLength(4);
        System.out.println("Set second rectangle length to 4");
        r2.setWidth(10);
        System.out.println("Set second rectangle width to 10");

        System.out.println("First rectangle: " + r1);
        System.out.println("Second rectangle: " + r2);

        System.out.println("First rectangle equals second rectangle: " + r1.equals(r2));

        System.out.println("First rectangle diagonal: " + r1.calculateDiagonal());
        System.out.println("Second rectangle diagonal: " + r2.calculateDiagonal());

        r1.rotate(45);
        System.out.println(r1); // Should display corner coordinates after rotation
    }
}
