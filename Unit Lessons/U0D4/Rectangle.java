public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
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
