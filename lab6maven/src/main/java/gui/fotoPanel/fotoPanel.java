package gui.fotoPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class fotoPanel extends JPanel {
    private BufferedImage _image;
    private String _path_name;


    public fotoPanel() {
        try {
            _image = ImageIO.read(new File("C:\\Users\\piotr\\Desktop\\foto\\bocian.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(_image,0,0,this);
    }

    public void set_path_name(String _path_name) {
        this._path_name = _path_name;
    }

    public void reset_image() throws IOException {
        _image = ImageIO.read(new File(_path_name));
    }

    static public void main(String[] args){
        JFrame frame = new JFrame("sd");
        frame.add(new fotoPanel());
        frame.pack();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
