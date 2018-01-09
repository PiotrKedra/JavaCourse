package gui.fotoListPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

public class fotoListPanel extends JPanel {
    private JTextField textField;
    private String _path_name;
    private JTree fileTree;
    public fotoListPanel(){
        textField = new JTextField("Give your path", 20);
        textField.addActionListener(new Listener());
        _path_name = "C:\\Users\\piotr\\Desktop\\foto";
        fileTree = new JTree(new FileTree().addNode(null,new File(_path_name)));
        fileTree.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) e
                        .getPath().getLastPathComponent();
                System.out.println("You selected " + node);
            }
        });

        JScrollPane scrollBar = new JScrollPane();
        scrollBar.setPreferredSize(new Dimension(250,350));
        scrollBar.setEnabled(false);
        scrollBar.getViewport().add(fileTree);
        setLayout(new BorderLayout());
        add(scrollBar,BorderLayout.CENTER);
        add(textField,BorderLayout.NORTH);
    }

    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==textField){
                _path_name = e.getActionCommand();
                System.out.println(_path_name);
                TreeModel model = fileTree.getModel();
                JTree tmpTree = new JTree(new FileTree().addNode(null,new File(_path_name)));
                fileTree.setModel(null);
                fileTree.setModel(tmpTree.getModel());
            }
        }
    }

    public String get_path_name() {
        return _path_name;
    }

    static public void main(String [] argc) throws Exception {
        ImageIO.read(new File("C:\\Users\\piotr\\Desktop\\foto\\tesla.jpg"));
        JFrame frame = new JFrame("fotoList");
        frame.add(new fotoListPanel());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
