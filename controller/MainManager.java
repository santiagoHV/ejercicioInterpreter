package controller;

import view.GraphicInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainManager {
    public static void main (String[] args) throws Exception {
        JFrame frame = new GraphicInterface();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(400, 400);

    }
}
