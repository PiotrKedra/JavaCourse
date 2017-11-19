package LayoutManagers;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        super("Will see");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setLocation(50,50);
        setLayout(new FlowLayout());
        /*
        FlowLayout() - jeden za drugim w jednym rzedzie, jezeli sie nie miesci to idzie w dół
        FlowLayout(int align)- wyrównuje elementy w zaleznosci od parametru
                np: FlowLayout.CENTER
        FlowLayout(int align, int hgap,int vgap) -  to samo ale dodaje odstepy

        GridLayout() - dzieli frame na klatki o takich samych rozmiarach
        GridLayout(int rows, int cols) - ustawia ilość wierzy i kolumn
        GridLayout(int rows, int cols, int hgap, int vgap) -||-

        BorderLayout() - my ustawiamy co i jak

         */

        add(new JButton("Przycisk 1"));
        add(new JButton("Przycisk 2"));
        add(new JButton("Przycisk 3"));

        setVisible(true);
    }
}
