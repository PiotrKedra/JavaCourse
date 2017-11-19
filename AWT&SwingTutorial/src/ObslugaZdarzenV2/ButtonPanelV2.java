package ObslugaZdarzenV2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class ButtonPanelV2 extends JPanel {
    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton _randomButton;
    private JButton _selfButton;
    private JButton _changeNameButton;

    private JPanel _buttonPanel;

    public ButtonPanelV2(){
        _randomButton = new RandomColorButton();
        _selfButton = new SelfChangeButton();
        _changeNameButton = new ChangeNameButton();

        _buttonPanel = this;

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(_randomButton);
        add(_selfButton);
        add(_changeNameButton);
    }

    class RandomColorButton extends JButton implements ActionListener {
        RandomColorButton(){
            super("Random");
            addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            int randomNum = ThreadLocalRandom.current().nextInt(0,2+1);
            if(randomNum==0){
               _buttonPanel.setBackground(Color.BLACK);
            }
            else if(randomNum==1){
                _buttonPanel.setBackground(Color.WHITE);
            }
            else if(randomNum==2){
                _buttonPanel.setBackground(Color.BLUE);
            }
        }
    }
    class SelfChangeButton extends JButton implements ActionListener{

        SelfChangeButton(){
            super("Change");
            addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.setBackground(Color.RED);
        }
    }
    class ChangeNameButton extends JButton implements ActionListener{

        ChangeNameButton(){
            super("ChangeName");
            addActionListener(this);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            this.setText("Changed");
        }
    }
}
