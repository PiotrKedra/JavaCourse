package JPanel_and_JComponent;

import javax.swing.*;

public class MyFrame2 extends JFrame{
    public MyFrame2(){
        super("Rysowanie");
        JPanel panel = new MyPanel();

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
