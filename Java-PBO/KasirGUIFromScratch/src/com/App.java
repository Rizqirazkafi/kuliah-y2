package com;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;

public class App {
    public static void main(String[] args) throws Exception {
        JLabel label = new JLabel();
        label.setText("Kasir Warung Makan");
        label.setFont(new Font("Serif",Font.BOLD, 48));
        // label.setForeground(Color.WHITE);
        // label.setBackground(Color.GRAY);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        // label.setBorder(new EmptyBorder(20,0,0,0));
        JPanel judul = new JPanel();
        // judul.setBackground(Color.GRAY);
        judul.setBounds(0,0,1280,80);
        judul.add(label);
        // Set menu
        JLabel menuText = new JLabel("Menu");
        menuText.setBounds(20,0,300,20);
        menuText.setFont(new Font("Serif", Font.PLAIN, 20));
        JComboBox menu = new JComboBox<>();
        menu.setFont(new Font("Serif", Font.PLAIN ,30));
        menu.addItem("Paket 1 - 10k");
        menu.addItem("Paket 2 - 12k");
        menu.addItem("Paket 3 - 8k");
        menu.addItem("Paket 4 - 10k");
        menu.setBounds(20,25,300,40);
        JButton menuKurang = new JButton("-");
        menuKurang.setFont(new Font("Serif", Font.PLAIN,40));
        menuKurang.setBounds(340,25,60,40);
        JButton menuTambah = new JButton("+");
        menuTambah.setFont(new Font("Serif", Font.PLAIN,40));
        menuTambah.setBounds(480,25,60,40);
        JTextField jumlahMenu = new JTextField(); 
        jumlahMenu.setBounds(410,25,60,40);
        JButton addBtn = new JButton("Add");
        addBtn.setBounds(550,25,80,40);
        addBtn.setFont(new Font("Serif", Font.PLAIN,20));
        
        // Set menu tambahan
        JLabel tambahanTitle = new JLabel("Tambahan");
        tambahanTitle.setBounds(20,70,300,20);
        tambahanTitle.setFont(new Font("Serif", Font.PLAIN, 20));
        JComboBox tambahan = new JComboBox<>();
        tambahan.addItem("Nasi - 5k");
        tambahan.addItem("Es teh - 3k");
        tambahan.setBounds(20,95,300,40);
        tambahan.setFont(new Font("Serif", Font.PLAIN,30));
        JButton menuKurangTambahan = new JButton("-");
        menuKurangTambahan.setFont(new Font("Serif", Font.PLAIN,40));
        menuKurangTambahan.setBounds(340,95,60,40);
        JButton menuTambahTambahan = new JButton("+");
        menuTambahTambahan.setFont(new Font("Serif", Font.PLAIN,40));
        menuTambahTambahan.setBounds(480,95,60,40);
        JTextField jumlahMenuTambahan = new JTextField(); 
        jumlahMenuTambahan.setBounds(410,95,60,40);
        JButton addBtnTambahan = new JButton("Add");
        addBtnTambahan.setBounds(550,95,80,40);
        addBtnTambahan.setFont(new Font("Serif", Font.PLAIN,20));
        // Text area total pesanan 
        JTextArea pesanan = new JTextArea();
        JScrollPane pesananScroll = new JScrollPane(pesanan);
        pesananScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pesananScroll.setBounds(20,150,610,200);

        JTextField hargaTotal = new JTextField();
        hargaTotal.setText("Harga Total");
        hargaTotal.setFont(new Font("Serif", Font.PLAIN,30));
        hargaTotal.setBounds(20,370,455,40);

        JTextField outputHargaTotal = new JTextField();
        outputHargaTotal.setBounds(485,370,145,40);
        
        JTextField uang = new JTextField();
        uang.setText("Uang");
        uang.setFont(new Font("Serif", Font.PLAIN,30));
        uang.setBounds(20,420,455,40);

        JTextField inputUang = new JTextField();
        inputUang.setBounds(485,420,145,40);
       
        JButton bayar = new JButton("Bayar");
        bayar.setBounds(485,470, 145,50);
        bayar.setFont(new Font("Serif", Font.PLAIN,30));

        JTextField kembali = new JTextField();
        kembali.setText("Uang Kembalian");
        kembali.setFont(new Font("Serif", Font.PLAIN,30));
        kembali.setBounds(20,530,455,40);

        JTextField outputKembali = new JTextField();
        outputKembali.setBounds(485,530,145,40);

        JButton reset = new JButton();
        reset.setText("Reset");
        reset.setFont(new Font("Serif", Font.PLAIN,30));
        reset.setBounds(20,580,455,50);

        JButton Cetak = new JButton("Cetak");
        Cetak.setBounds(485,580, 145,50);
        Cetak.setFont(new Font("Serif", Font.PLAIN,30));


        JPanel kiri = new JPanel();
        kiri.setBounds(0,81,640,640);
        // kiri.setBackground(new Color(60,63,65));
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
        kiri.add(hargaTotal);
        kiri.add(outputHargaTotal);
        kiri.add(uang);
        kiri.add(inputUang);
        kiri.add(bayar);
        kiri.add(kembali);
        kiri.add(outputKembali);
        kiri.add(reset);
        kiri.add(Cetak);

        JTextArea struk = new JTextArea(41,50);
        struk.setEditable(false);
        JScrollPane strukOut = new JScrollPane(struk);
        strukOut.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        strukOut.setBounds(20,20,600,600);

        JPanel kanan = new JPanel();
        kanan.setBounds(640,90,640,640); 
        kanan.add(strukOut);
        // kanan.setBackground(Color.GREEN);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(judul);
        frame.add(kiri);
        frame.add(kanan);
        // frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(1280,720);
        frame.setVisible(true);
        // frame.add(panelAtas);
    }
}
