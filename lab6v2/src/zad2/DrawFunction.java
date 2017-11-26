package zad2;

import GlobalVariables.Size;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawFunction extends JComponent {
    private static final int _y_shift= Size.HEIGHT/2;
    private static final int _x_shift= Size.WIDTH/2;

    private ArrayList<Point> _points = new ArrayList<Point>();


    public DrawFunction(){
        for(int i=0;i<=200;++i){
            _points.add(new Point(i+_x_shift,-i*i+_y_shift));
        }
    }

    public void drawFunction(Graphics2D g2d){
        for(Point p: _points){
            g2d.fillOval((int)p.getX(),(int)p.getY(),2,2);
        }
    }
}
