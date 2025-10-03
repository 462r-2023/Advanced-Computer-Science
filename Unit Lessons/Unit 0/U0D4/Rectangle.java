public class Rectangle {

    private int length;
    private int width;
    private Point[] points;

    public Rectangle() {
        length = 0;
        width = 0;
        points = new Point[] {new Point(0, 0), new Point(length, 0), new Point(0, width),
                new Point(length, width)};
    }

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
        points = new Point[] {new Point(0, 0), new Point(length, 0), new Point(0, width),
                new Point(length, width)};
    }

    public void rotate(double degrees) {
        for (int i = 0; i < 4; i++) {
            points[i] = new Point(
                    points[i].getX() * Math.cos(degrees) - points[i].getY() * Math.sin(degrees),
                    points[i].getX() * Math.sin(degrees) + points[i].getY() * Math.cos(degrees));
        }
    }

    public Rectangle(int newLength, int newWidth, double rotation) {
        length = newLength;
        width = newWidth;
        points = new Point[] {new Point(0, 0), new Point(length, 0), new Point(0, width),
                new Point(length, width)};
        rotate(rotation);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

    public String toString() {
        return "This rectangle has a length of " + length + " and a width of " + width
                + ". Its area is " + calculateArea() + ".";
    }

    public boolean equals(Rectangle other) {
        return length == other.length && width == other.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
