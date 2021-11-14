import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class App {
    public static void main(String[] args) throws Exception {
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        // Set Frame
        JFrame frame = new JFrame();
        // Set App Icon
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage()); //Ubah icon pada frame
        frame.getContentPane().setBackground(new Color(221,192,168));
        // Set Label
        JLabel label = new JLabel();
        ImageIcon image_new = new ImageIcon("firefox.png");
        label.setText("Bro, do you even code"); // set text of label
        label.setIcon(image_new);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of Icon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setFont(new Font("Fira Code",Font.PLAIN,40));
        label.setIconTextGap(-10);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,400,400); // x,y,width,height
        frame.setTitle("Main program"); // Judul Frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Keluar dari aplikasi
        frame.setResizable(false); //mencegah frame resize
        frame.setSize(500,500); //ukuran Frame
        // frame.setLayout(null);
        frame.setVisible(true); //Membuat frame terlihat
        frame.add(label);
        frame.pack();
        

    }
}
