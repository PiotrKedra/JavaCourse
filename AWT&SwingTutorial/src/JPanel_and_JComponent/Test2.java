package JPanel_and_JComponent;

import java.awt.*;

public class Test2 {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame2();
            }
        });
    }
}
