import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle(25, 40, 64));
        shapes.getLast().setFillColor(255, 255, 0);
        shapes.add(new Circle(28, 62, 36));
        shapes.getLast().setFillColor(192, 192, 192);
        shapes.add(new Circle(52, 58, 44));
        shapes.getLast().setFillColor(192, 192, 192);
        shapes.add(new Circle(82, 62, 36));
        shapes.getLast().setFillColor(192, 192, 192);

        // building
        shapes.add(new Rectangle(150, 75, 50, 50));
        shapes.getLast().setFillColor(204, 102, 0);
        shapes.add(new Rectangle(125, 125, 250, 250));
        shapes.getLast().setFillColor(204, 102, 0);
        shapes.add(new Rectangle(275, 175, 25, 25));
        shapes.getLast().setFillColor(199, 236, 246);
        shapes.getLast().setStrokeColor(102, 51, 0);
        shapes.getLast().setStrokeWidth(2);
        shapes.add(new Rectangle(300, 175, 25, 25));
        shapes.getLast().setFillColor(199, 236, 246);
        shapes.getLast().setStrokeColor(102, 51, 0);
        shapes.getLast().setStrokeWidth(2);
        shapes.add(new Rectangle(275, 200, 25, 25));
        shapes.getLast().setFillColor(199, 236, 246);
        shapes.getLast().setStrokeColor(102, 51, 0);
        shapes.getLast().setStrokeWidth(2);
        shapes.add(new Rectangle(300, 200, 25, 25));
        shapes.getLast().setFillColor(199, 236, 246);
        shapes.getLast().setStrokeColor(102, 51, 0);
        shapes.getLast().setStrokeWidth(2);
        shapes.add(new Circle(304, 354, 36));
        shapes.getLast().setFillColor(0, 153, 0);
        shapes.add(new Circle(324, 346, 44));
        shapes.getLast().setFillColor(0, 153, 0);
        shapes.add(new Circle(350, 354, 36));
        shapes.getLast().setFillColor(0, 153, 0);

        // door
        shapes.add(new Rectangle(175, 250, 50, 125));
        shapes.getLast().setFillColor(102, 51, 0);
        shapes.getLast().setStrokeColor(255, 197, 20);
        shapes.getLast().setStrokeWidth(2);
        shapes.add(new Circle(212, 324, 10));
        shapes.getLast().setFillColor(255, 255, 255);

        // roof
        shapes.add(new Triangle(new int[] {125, 250, 375}, new int[] {125, 75, 125}));
        shapes.getLast().setFillColor(204, 102, 0);
        shapes.getLast().setStrokeColor(102, 51, 0);
        shapes.getLast().setStrokeWidth(4);


        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }


    }


}
