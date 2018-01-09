package gui.fotoListPanel;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;
import java.util.Collections;
import java.util.Vector;

class FileTree extends JTree {
    DefaultMutableTreeNode addNode(DefaultMutableTreeNode parent, File dir){
        String currentPath = dir.getPath();
        DefaultMutableTreeNode currentDir = new DefaultMutableTreeNode(currentPath);
        if(parent != null) {
            parent.add(currentDir);
        }
        Vector ol = new Vector();
        String[] tmp = dir.list();
        for(String elem:tmp){
            ol.addElement(elem);
        }
        Collections.sort(ol, String.CASE_INSENSITIVE_ORDER); //sortuje jakos alfabetycznie
        File file;
        Vector files = new Vector();
        for(int i=0;i<ol.size();++i) {
            String thisObject = (String) ol.elementAt(i);
            String newPath;
            if (currentPath.equals(".")) {
                newPath = thisObject;
            } else {
                newPath = currentPath + File.separator + thisObject;
            }
            if ((file = new File(newPath)).isDirectory()) {
                addNode(currentDir, file);
            } else {
                files.addElement(thisObject);
            }
        }
        for(int fileNumber=0;fileNumber<files.size();++fileNumber){
            currentDir.add(new DefaultMutableTreeNode(files.elementAt(fileNumber)));
        }
        return currentDir;
    }
}

