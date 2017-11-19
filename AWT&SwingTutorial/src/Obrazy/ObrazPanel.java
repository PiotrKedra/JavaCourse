package Obrazy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ObrazPanel extends JPanel{
    private BufferedImage _image;
    private BufferedImage _imageURL;

    public ObrazPanel() {

        try{
            _imageURL = ImageIO.read(new URL("https://www.cleverfiles.com/howto/wp-content/uploads/2016/08/mini.jpg"));
            _image = ImageIO.read(new File("mb.jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
        Dimension dimension = new Dimension(_image.getWidth()*2,_image.getHeight());
        setPreferredSize(dimension);
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(_image,0,0,this);
        g2d.drawImage(_imageURL,_image.getWidth(),0,this);
    }
}
