public class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        this(3, 4);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return super.toString() + "\nIt is a triangle with a base of " + base + " and height of "
                + height + ". Its area is " + height + ".";
    }
}
