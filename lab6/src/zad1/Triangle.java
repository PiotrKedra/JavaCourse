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

    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.RED);
        g.drawLine(_x,_y,_x+50,_y);
        g.drawLine(_x,_y,_x+25,_y-40);
        g.drawLine(_x+50,_y,_x+25,_y-40);
    }
}