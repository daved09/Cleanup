package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCleaner extends JFrame{

    private JPanel mainPanel;
    private JTextField txtPath;
    private JButton btnOpenPath;

    public GuiCleaner(){
        initGui();
        initListener();
    }

    private void initGui(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setTitle("Cleaner");
    }

    private void initListener(){
        btnOpenPath.addActionListener(new Button());
    }

    public void open(){
        this.setVisible(true);
    }

    public void close(){
        this.setVisible(false);
    }

    private class Button implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(btnOpenPath)){
            }
        }
    }

}
