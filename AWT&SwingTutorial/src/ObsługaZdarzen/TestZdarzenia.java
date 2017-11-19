package ObsługaZdarzen;

import java.awt.EventQueue;

class TestZdarzenia {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionFrame();
            }
        });
    }
}
