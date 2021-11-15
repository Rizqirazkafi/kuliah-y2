package com;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
public class App{
    public static void main(String[] args) {
        //JLabel = a GUI Display area for string of text, image or both        
        ImageIcon image = new ImageIcon("firefox.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel();
        label.setText("Unga bunga don't understand");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green); 
        label.setIconTextGap(5);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setFont(new Font("Noto Sans",Font.PLAIN,20));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,400,400);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.setForeground(Color.white);
        frame.add(label);
        frame.pack();
    }
}

/**public class App {
    public static void main(String[] args) throws Exception {
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        // Set Frame
        JFrame frame = new JFrame();
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage()); //Ubah icon pada frame
        frame.getContentPane().setBackground(new Color(221,192,168));
        ImageIcon ff = new ImageIcon("firefox.png");
        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(ff);
        label.setBounds(0,0,75,75);
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red); 
        redPanel.setBounds(0,0,250,250);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue); 
        bluePanel.setBounds(250,0,250,250);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green); 
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);
        
        // Set App Icon
        // Set Label
        // JLabel label = new JLabel();
        // ImageIcon image_new = new ImageIcon("firefox.png");
        // label.setText("Bro, do you even code"); // set text of label
        // label.setIcon(image_new);
        // label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of Icon
        // label.setVerticalTextPosition(JLabel.TOP);
        // label.setForeground(Color.white);
        // label.setFont(new Font("Fira Code",Font.PLAIN,40));
        // label.setIconTextGap(-10);
        // label.setBackground(Color.black);
        // label.setOpaque(true);
        // label.setBorder(border);
        // label.setVerticalAlignment(JLabel.CENTER);
        // label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,400,400); // x,y,width,height
        frame.setTitle("Main program"); // Judul Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Keluar dari aplikasi
        // frame.setResizable(false); //mencegah frame resize
        frame.setSize(750,750); //ukuran Frame
        frame.setLayout(null);
        frame.setVisible(true); //Membuat frame terlihat
        // frame.add(label);
        // JPanels 
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);



        frame.pack();
        

    }**
}
**/