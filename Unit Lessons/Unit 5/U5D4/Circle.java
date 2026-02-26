import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {
    private int radius;
    private Color outline;
    private Color fill;

    public Circle(int xCoord, int yCoord, int radius, Color outline, Color fill) {
        super(xCoord, yCoord);
        this.radius = radius;
        this.outline = outline;
        this.fill = fill;
    }

    public Circle(int xCoord, int yCoord, int radius) {
        this(xCoord, yCoord, radius, Color.orange, Color.blue);
    }

    public Circle(int radius) {
        this(0, 0, radius, Color.orange, Color.blue);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void draw(Graphics g) {
        Graphics2D g2D = (Graphics2D) g; // Initialize a Graphics 2D object
        g2D.setColor(fill); // Set the color of the circle
        g2D.fillOval(xCoord, yCoord, radius, radius); // Draw the circle using the fillOval method

        g2D.setPaint(outline); // set the color of the circle
        g2D.setStroke(new BasicStroke(5)); // change the stroke width
        g2D.drawOval(xCoord, yCoord, radius, radius); // draw the circle using the drawOval method
    }

    public String toString() {
        return super.toString() + "It is a circle with a radius of " + radius + ". It's area is "
                + getArea() + ".";
    }
}
