/*
 * Student Name: Qixuan Xin
 * Student ID: 1202931
 */

package GUIComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class LineTextField extends JTextField {
    private Shape shape;
    private final int arcWidth;
    private final int arcHeight;

    public LineTextField(int size, int arcWidth, int arcHeight) {
        super(size);
        this.arcHeight = arcHeight;
        this.arcWidth = arcWidth;
        this.setMargin(new Insets(0, 10, 0, 10));
        setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRect(0, getHeight() - 3, getWidth() - 1, 2);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {

    }

    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight);
        }
        return shape.contains(x, y);
    }
}
