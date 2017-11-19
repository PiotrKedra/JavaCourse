package zad1;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel implements Shape{
    private int _x;
    private int _y;

    public void setCords(int x, int y){
        _x = x;
        _y = y;
    }

    public void paint(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.RED);
        g.fillPolygon(new int[]{_x,_x+40,_x+80}, new int[]{_y,_y-40,_y},3);
    }
}