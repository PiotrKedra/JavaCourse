package zad2;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        new DrawFunction().drawFunction(g2d);
        new Axis().drawAxis(g2d);
    }
}
