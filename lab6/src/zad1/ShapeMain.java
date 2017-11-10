package zad1;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShapeMain extends JFrame {
    public static void main(String [] args){
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Square square = new Square();
        square.setCords(300,50);
        Triangle triangle = new Triangle();
        triangle.setCords(100,100);
        f.add(triangle);
        f.add(square);
        f.setSize(800,375);
        f.setVisible(true);
    }
}
