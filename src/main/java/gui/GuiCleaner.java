package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GuiCleaner extends JFrame{

    //Eigene Klassen

    //Listener
    KeyListener keyboard;

    //Gui Klassen
    private JPanel mainPanel;
    private JTextField txtPath;
    private JPanel listPanel;
    private JPanel pathPanel;
    private JList fileListView;

    //Java Klassen

    public GuiCleaner(){
        initalize();
        initGui();
        initListener();
    }

    private void initGui(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setTitle("Cleaner");
    }

    private void initalize(){
        keyboard = new Keyboard();
    }

    private void initListener(){
        txtPath.addKeyListener(keyboard);
    }

    public void open(){
        this.setVisible(true);
    }

    public void close(){
        this.setVisible(false);
    }

    private class Button implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        }
    }

    private class Keyboard implements KeyListener{

        public void keyTyped(KeyEvent e) {

        }

        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
            }
        }

        public void keyReleased(KeyEvent e) {

        }
    }

}
