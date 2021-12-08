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
        judul.setBounds(0,0,1280,80);
        judul.add(label);
        // Set menu
        JLabel menuText = new JLabel("Menu");
        menuText.setBounds(20,0,300,20);
        menuText.setFont(new Font("Roboto", Font.PLAIN, 20));
        JComboBox menu = new JComboBox<>();
        menu.setFont(new Font("Roboto", Font.CENTER_BASELINE ,30));
        menu.addItem("Paket 1 - 10k");
        menu.addItem("Paket 2 - 12k");
        menu.addItem("Paket 3 - 8k");
        menu.addItem("Paket 4 - 10k");
        menu.setBounds(20,25,300,40);
        JButton menuKurang = new JButton("-");
        menuKurang.setFont(new Font("Roboto", Font.CENTER_BASELINE,40));
        menuKurang.setBounds(340,25,60,40);
        JButton menuTambah = new JButton("+");
        menuTambah.setFont(new Font("Roboto", Font.CENTER_BASELINE,40));
        menuTambah.setBounds(480,25,60,40);
        JTextField jumlahMenu = new JTextField(); 
        jumlahMenu.setBounds(410,25,60,40);
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(550,25,80,40);
        addBtn.setFont(new Font("Roboto", Font.CENTER_BASELINE,25));
        
        // Set menu tambahan
        JLabel tambahanTitle = new JLabel("Tambahan");
        tambahanTitle.setBounds(20,70,300,20);
        tambahanTitle.setFont(new Font("Roboto", Font.PLAIN, 20));
        JComboBox tambahan = new JComboBox<>();
        tambahan.addItem("Nasi - 5k");
        tambahan.addItem("Es teh - 3k");
        tambahan.setBounds(20,95,300,40);
        tambahan.setFont(new Font("Roboto", Font.CENTER_BASELINE,30));
        JButton menuKurangTambahan = new JButton("-");
        menuKurangTambahan.setFont(new Font("Roboto", Font.CENTER_BASELINE,40));
        menuKurangTambahan.setBounds(340,95,60,40);
        JButton menuTambahTambahan = new JButton("+");
        menuTambahTambahan.setFont(new Font("Roboto", Font.CENTER_BASELINE,40));
        menuTambahTambahan.setBounds(480,95,60,40);
        JTextField jumlahMenuTambahan = new JTextField(); 
        jumlahMenuTambahan.setBounds(410,95,60,40);
        JButton addBtnTambahan = new JButton("Add");
        addBtnTambahan.setBounds(550,95,80,40);
        addBtnTambahan.setFont(new Font("Roboto", Font.CENTER_BASELINE,25));
        // Text area total pesanan 
        JTextArea pesanan = new JTextArea();
        JScrollPane pesananScroll = new JScrollPane(pesanan);
        pesananScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pesananScroll.setBounds(20,150,610,200);

        JPanel kiri = new JPanel();
        kiri.setBounds(0,81,640,640);
        kiri.setBackground(Color.RED);
        kiri.setLayout(null);
        kiri.add(menuText);
        kiri.add(menu);
        kiri.add(menuKurang);
        kiri.add(addBtn);
        kiri.add(jumlahMenu);
        kiri.add(menuTambah);
        kiri.add(tambahanTitle);
        kiri.add(tambahan);
        kiri.add(menuKurangTambahan);
        kiri.add(jumlahMenuTambahan);
        kiri.add(menuTambahTambahan);
        kiri.add(addBtnTambahan);
        kiri.add(pesananScroll);
        JPanel kanan = new JPanel();
        kanan.setBounds(640,81,640,640); 
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
