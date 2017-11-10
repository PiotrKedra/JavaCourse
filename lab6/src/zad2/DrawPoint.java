package zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawPoint extends JPanel{
    int _x;
    int _y;
    public  void drawCircle(Graphics arg0, int x, int y, int r){
        Graphics2D g2 = (Graphics2D) arg0;
        Ellipse2D e = new Ellipse2D.Double(x,y,r,r);
        g2.draw(e);

        GradientPaint gp = new GradientPaint(x-r/2, y-r/2, Color.red,x+r/2, y+r/2, Color.blue, false);
        // Fill with a gradient.
        g2.setPaint(gp);
        g2.fill(e);

        g2.draw(e);
    }
    public void setCords(int x, int y){
        _x = x;
        _y = y;
    }

    public void paint(Graphics arg0) {
        drawCircle(arg0,_x, _y, 1);

    }
}
