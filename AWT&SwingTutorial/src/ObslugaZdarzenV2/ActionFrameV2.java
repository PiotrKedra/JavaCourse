package ObslugaZdarzenV2;

import javax.swing.*;


public class ActionFrameV2 extends JFrame{
    public ActionFrameV2() {
        super("Test akcji");

        JPanel buttonPanel = new ButtonPanelV2();
        add(buttonPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
