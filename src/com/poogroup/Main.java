package com.poogroup;


import com.poogroup.gui.LandingWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\E095713\\Documents\\Programming\\UDB\\CosasPOO\\Foro2\\src\\com\\poogroup\\media\\images\\TODOPC-Logo.png");
        JDialog imageDialog = new JDialog();
        imageDialog.setIconImage(icon.getImage());
        imageDialog.setTitle("TODOPC");
        imageDialog.add(new JLabel(icon));
        imageDialog.pack();
        imageDialog.setLocationRelativeTo(null);
        imageDialog.setVisible(true);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                imageDialog.dispose();
                JOptionPane.showMessageDialog(null, "5 seconds have passed. Transitioning to the next dialog.", "TODOPC", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }, 5000);
    }
}