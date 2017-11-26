package zad2;

import GlobalVariables.Size;

import javax.swing.*;
import java.awt.*;

public class Axis extends JComponent{

    public void drawAxis(Graphics2D g2d) {
        g2d.drawLine(0, Size.HEIGHT/2,Size.WIDTH,Size.HEIGHT/2);
        g2d.drawLine(Size.WIDTH/2, 0,Size.WIDTH/2,Size.HEIGHT);
    }
}
