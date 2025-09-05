public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 6);
        Rectangle r2 = new Rectangle(3, 5);

        System.out.println(r1);
        System.out.println(r2);

        r1.setLength(4);
        r1.setWidth(10);
        r2.setLength(4);
        r2.setWidth(10);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(r1.equals(r2));

        System.out.println(r1.calculateDiagonal());
        System.out.println(r2.calculateDiagonal());
    }
}
