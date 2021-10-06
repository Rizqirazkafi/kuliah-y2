package com.latihanEmpat.satu; 

import javax.swing.JOptionPane;

public class JOptionpane {
public static void main(String[]args){
  String nilai1="";
  String nilai2="";
  String nilai3="";
  int nilai_1;
  int nilai_2;
  int nilai_3;
  int rataRataNilai;
  String hasil= "";

  nilai1=JOptionPane.showInputDialog("Masukkan nilai pertama");
  nilai_1 = Integer.valueOf(nilai1).intValue();
  nilai2=JOptionPane.showInputDialog("Masukkan nilai kedua");
  nilai_2 = Integer.valueOf(nilai2).intValue();
  nilai3=JOptionPane.showInputDialog("Masukkan nilai ketiga");
  nilai_3 = Integer.valueOf(nilai3).intValue();
  
  rataRataNilai=(nilai_1+nilai_2+nilai_3)/3;

  hasil=hasil + "Nilai pertama  : " +nilai_1 +"\n";
  hasil=hasil + "Nilai kedua    : " +nilai_2 +"\n";
  hasil=hasil + "Nilai ketiga   : " +nilai_3 +"\n";
  hasil=hasil + "Rata-rata nilai:" +rataRataNilai+"\n";

   if (rataRataNilai<=60){
   hasil=hasil+":-("+"\n";
  }
  else {hasil=hasil+":-)"+"\n";
  }
  JOptionPane.showMessageDialog(null, hasil);
  }
}
