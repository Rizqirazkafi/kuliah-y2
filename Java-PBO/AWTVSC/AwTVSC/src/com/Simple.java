package com;
import javax.swing.*;
public class Simple {
    JFrame a;
    Simple(){
        a = new JFrame();
        JButton c = new JButton("Click");
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBounds(130,220,100,40);
        a.add(c);
        a.setSize(400,500);
        a.setLayout(null);
        a.setVisible(true);
    }
}
