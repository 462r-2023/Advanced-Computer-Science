import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape {
    private int length;
    private int width;
    private Color outline;
    private Color fill;

    public Rectangle(int xCoord, int yCoord, int length, int width, Color outline, Color fill) {
        super(xCoord, yCoord);
        this.length = length;
        this.width = width;
        this.outline = outline;
        this.fill = fill;
    }

    // Constructor that takes in 2 coordinates and the dimensions of the rectangle
    public Rectangle(int xCoord, int yCoord, int length, int width) {
        this(xCoord, yCoord, length, width, Color.red, Color.pink);
    }

    // Constructor that takes in the dimensions of the rectangle, sets default
    // coordinates to (0, 0)
    public Rectangle(int length, int width) {
        this(0, 0, length, width, Color.red, Color.pink);
    }

    // Returns the area of the rectangle
    public double getArea() {
        return (double) this.length * this.width;
    }

    // Draws the rectangle
    public void draw(Graphics g) {

        Graphics2D g2D = (Graphics2D) g; // initializes a 2D graphics component
        g2D.setPaint(fill); // sets the paint color to Pink
        g2D.fillRect(xCoord, yCoord, length, width); // draws a rectangle (filled in with pink)

        g2D.setPaint(outline); // sets the paint color to red
        g2D.setStroke(new BasicStroke(5)); // changes the line stroke width to 5
        g2D.drawRect(xCoord, yCoord, length, width); // draws a rectangle outline

    }

}
