package zad2;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String [] args){
        Main main = new Main();
        PointHolder points = new PointHolder();
        main.setSize(600, 600);
        main.setVisible(true);
        for(int i=0;i<600;++i){
            DrawPoint point = new DrawPoint();
            point.setCords(i,i);
            main.add(point);
        }
    }

        /*public Main() {
            this.setPreferredSize(new Dimension(800, 800));
            this.pack();
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            // define the position
            int locX = 200;
            int locY = 200;

            // draw a line (there is no drawPoint..)
            g.drawLine(locX, locY, locX, locY);
        }

        public static void main(String[] args) {
            Main test = new Main();
        }*/
}
