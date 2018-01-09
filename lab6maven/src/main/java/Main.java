import exceptions.DirDoesNotExistException;
import exceptions.WrongFileInDirException;
import gui.fotoListPanel.fotoListPanel;
import gui.fotoPanel.fotoPanel;
import implementation.Segregate;
import io.indico.api.utils.IndicoException;
import org.apache.commons.io.FilenameUtils;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*try {
            Segregate segregateion = new Segregate();
            segregateion.set_curent_dir("fotos");
            File dir=new File("fotos");
            if(dir.exists()){
                throw new DirDoesNotExistException();
            }
            File[] files = dir.listFiles();
            ArrayList<String> fileNames = new ArrayList<String>();
            File[] fileNamees;

            for(File file: files){
                if(FilenameUtils.getExtension(file.getAbsolutePath()).equals("jpg")){
                    segregateion.classify(file.getAbsolutePath());
                    segregateion.move(file.getName());
                } else if(FilenameUtils.getExtension(file.getAbsolutePath()).equals("")){
                    System.out.println(FilenameUtils.getExtension(file.getAbsolutePath()));
                }else {
                    throw new WrongFileInDirException(file.getName());
                }
            }

        }catch (WrongFileInDirException | DirDoesNotExistException |IndicoException | IOException e){
            e.printStackTrace();
        }*/

        JFrame frame = new JFrame("GUI");
        frame.setPreferredSize(new Dimension(800,300));
        frame.setLayout(new BorderLayout());
        frame.add(new fotoPanel(),BorderLayout.CENTER);
        frame.add(new fotoListPanel(),BorderLayout.LINE_START);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
