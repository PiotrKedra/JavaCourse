package zad2;

import GlobalVariables.*;

import javax.swing.*;
import java.awt.*;

public class Frame  extends JFrame{
    public Frame(){
        super("Wykres");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        add(new Panel());
        setSize(new Dimension(Size.WIDTH,Size.HEIGHT));
        setVisible(true);
    }
}
