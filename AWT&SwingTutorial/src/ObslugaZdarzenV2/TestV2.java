package ObslugaZdarzenV2;

import java.awt.*;

public class TestV2 {
    public static void main(String [] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionFrameV2();
            }
        });
    }
}
