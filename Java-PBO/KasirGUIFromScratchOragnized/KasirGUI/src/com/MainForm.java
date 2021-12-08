package com;

import java.awt.Color;

import javax.swing.*;

public class MainForm{
    MainForm(){
        new PanelKiri();
        new PanelKanan();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // Add frame components here :
        frame.add(new PanelKiri());
        frame.add(new PanelKanan());
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1280,720);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setVisible(true);
    }
}