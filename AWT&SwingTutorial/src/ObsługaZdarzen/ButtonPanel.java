package ObsługaZdarzen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {
    public static final int HEIGHT =100;
    public static final int WEIGHT = 300;
    private JButton _greenButton;
    private JButton _blueButton;
    private JButton _redButton;

    public ButtonPanel(){
        _greenButton = new JButton("Green");
        _blueButton = new JButton("Blue");
        _redButton = new JButton("Red");

        _greenButton.addActionListener(this);
        _blueButton.addActionListener(this);
        _redButton.addActionListener(this);

        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        add(_blueButton);
        add(_greenButton);
        add(_redButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == _greenButton)
            setBackground(Color.GREEN);

        else if(source == _blueButton)
            setBackground(Color.BLUE);

        else if(source == _redButton)
            setBackground(Color.RED);
    }

}
