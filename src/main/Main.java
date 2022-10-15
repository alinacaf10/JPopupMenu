package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Pop up Menu");
        JPopupMenu pm=new JPopupMenu("Menu");
        JMenuItem m1=new JMenuItem("Cut");
        JMenuItem m2=new JMenuItem("Copy");
        JMenuItem m3=new JMenuItem("Paste");
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pm.show(frame,frame.getX(),frame.getY());
            }
        });
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Cut");
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Copy");
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Paste");
            }
        });


        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(pm);
    }
}
