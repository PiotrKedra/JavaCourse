package zad1;

import javax.swing.*;
import java.awt.*;

public class Square extends JPanel implements Shape{
    private int _x;
    private int _y;

    public void setCords(int x, int y){
        _x = x;
        _y = y;
    }

    protected void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        g.setColor(Color.DARK_GRAY);
        g.fillRect(_x, _y, 50, 50);
    }
}
