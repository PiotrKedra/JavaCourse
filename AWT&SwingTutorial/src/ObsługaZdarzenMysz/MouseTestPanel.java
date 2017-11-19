package ObsługaZdarzenMysz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MouseTestPanel  extends JPanel implements MouseListener{

    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;
    private int _x,_y;

    ArrayList<Point> _points = new ArrayList<Point>();

    public MouseTestPanel(){
        addMouseListener(this);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        _points.add(new Point(e.getX(),e.getY()));
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0,0,WIDTH,HEIGHT);
        g2d.setColor(Color.BLACK);
        drawRectangles(g2d);
    }

    private void drawRectangles(Graphics2D g2d){
        for(Point p: _points){
            g2d.fillRect((int)p.getX(),(int)p.getY(),10,10);
        }
    }
}
