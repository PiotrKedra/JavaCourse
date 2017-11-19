package Obrazy;

import javax.swing.*;

public class ObrazFrame extends JFrame {
    public ObrazFrame(){
        super("Obrazek");

        JPanel obrazPanel = new ObrazPanel();
        add(obrazPanel);


        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
