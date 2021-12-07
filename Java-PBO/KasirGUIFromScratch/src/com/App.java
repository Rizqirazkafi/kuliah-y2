package com;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;

public class App {
    public static void main(String[] args) throws Exception {
        JLabel label = new JLabel();
        label.setText("Kasir Warung Makan");
        label.setFont(new Font("Roboto",Font.BOLD, 48));
        label.setForeground(Color.WHITE);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        // label.setBorder(new EmptyBorder(20,0,0,0));
        JPanel judul = new JPanel();
        judul.setBackground(Color.GRAY);
        judul.setBounds(0,0,1280,120);
        judul.add(label);
        JPanel panelAtas = new JPanel();
        panelAtas.setBackground(Color.BLUE);
        panelAtas.setBounds(30, 100, 270, 40);
        JComboBox menu = new JComboBox<>();
        menu.setFont(new Font("Roboto", Font.CENTER_BASELINE ,30));
        menu.addItem("Paket 1 - 10k");
        menu.addItem("Paket 2 - 12k");
        menu.addItem("Paket 3 - 8k");
        menu.addItem("Paket 4 - 10k");
        menu.setBounds(20,20,300,40);
        JButton menuKurang = new JButton("-");
        menuKurang.setFont(new Font("Roboto", Font.CENTER_BASELINE,40));
        menuKurang.setBounds(340,20,60,40);
        JButton menuTambah = new JButton("+");
        menuTambah.setFont(new Font("Roboto", Font.CENTER_BASELINE,40));
        menuTambah.setBounds(480,20,60,40);
        JTextField jumlahMenu = new JTextField(); 
        jumlahMenu.setBounds(410,20,60,40);
        JTextArea pesanan = new JTextArea();
        JScrollPane pesananScroll = new JScrollPane(pesanan);
        pesananScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pesananScroll.setBounds(20,70,600,300);
        JPanel kiri = new JPanel();
        kiri.setBounds(0,121,640,600);
        kiri.setBackground(Color.RED);
        kiri.setLayout(null);
        kiri.add(menu);
        kiri.add(menuKurang);
        kiri.add(jumlahMenu);
        kiri.add(menuTambah);
        kiri.add(pesananScroll);
        JPanel kanan = new JPanel();
        kanan.setBounds(641,121,640,600); 
        kanan.setBackground(Color.GREEN);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(judul);
        frame.add(kiri);
        frame.add(kanan);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.setVisible(true);
        // frame.add(panelAtas);
    }
}
