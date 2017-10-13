package gui;

import javax.swing.*;
import java.io.File;

public class GuiToolkit {

    public String openPath(String defaultDirectory){
        String dir = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Ordner auswählen");
        fileChooser.setDialogType(JFileChooser.DIRECTORIES_ONLY);
        fileChooser.setAcceptAllFileFilterUsed(false);
        if(directoryExists(defaultDirectory)){
            fileChooser.setCurrentDirectory(new File(defaultDirectory));
        }
        else{
            fileChooser.setCurrentDirectory(new File("."));
        }
        int option = fileChooser.showDialog(null,"Ordner auswählen");
        if(option == JFileChooser.APPROVE_OPTION){
            dir = fileChooser.getCurrentDirectory().getAbsolutePath();
            return dir;
        }
        return defaultDirectory;
    }

    private boolean directoryExists(String dir){
        File file = new File(dir);
        return file.exists();
    }

}
