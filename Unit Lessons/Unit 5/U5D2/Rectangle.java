public class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this(3, 4);
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + length
                + " and a width of " + width + ". Its area is " + getArea() + ".";
    }
}
