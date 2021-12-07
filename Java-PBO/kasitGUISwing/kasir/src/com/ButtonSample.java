package com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import java.util.Random;
import java.io.FileReader;
public class ButtonSample {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Contoh tombol");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                final JButton buttonAdd = new JButton("Tambah");
                final JButton buttonDec = new JButton("Kurangi");
                final Random random = new Random();
                // Define action listener
                ActionListener penambahan = new ActionListener(){
                    public void actionPerformed(ActionEvent actionEvent) {
                        // System.out.println("I was selected");
                        JButton buttonTambah = (JButton)actionEvent.getSource();
                        int nilai = nilai + 1;
                    };
                };

                ActionListener pengurangan = new ActionListener(){
                    public void actionPerformed(ActionEvent actionEvent) {
                        // System.out.println("I was selected");
                        JButton buttonKurang = (JButton)actionEvent.getSource();
                        int nilai = nilai - 1;
                    };
                };
                // Attach Listener
                buttonAdd.addActionListener(penambahan);
                frame.add(buttonAdd, BorderLayout.SOUTH);
                buttonDec.addActionListener(pengurangan);
                frame.add(buttonAdd, BorderLayout.NORTH);
                frame.setSize(300,100);
                frame.setVisible(true);
                frame.setResizable(false);
            }
        };
        EventQueue.invokeLater(runner);
    }
}
