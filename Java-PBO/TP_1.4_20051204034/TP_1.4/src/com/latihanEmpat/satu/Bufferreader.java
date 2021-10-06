package com.latihanEmpat.satu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Bufferreader {
  public static void main(String[]args){
  BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
  String nilaiSatu="";
  String nilaiDua="";
  String nilaiTiga="";
  int nilai_1;
  int nilai_2;
  int nilai_3;
  int rataRata;
  
  try{
   System.out.print("Masukkan nilai pertama     : ");
   nilaiSatu = nilai.readLine();
   System.out.print("Masukkan nilai kedua       : ");
   nilaiDua = nilai.readLine();
   System.out.print("Masukkan nilai ketiga      : ");
   nilaiTiga = nilai.readLine();
  }
  catch(IOException e){
  System.out.println("Data yang diinputkan hanya berupa angka. Silahkan ulangi");
  }

  nilai_1 = Integer.parseInt(nilaiSatu);
  nilai_2 = Integer.parseInt(nilaiDua);
  nilai_3 = Integer.parseInt(nilaiTiga);

  rataRata=(nilai_1+nilai_2+nilai_3)/3;
  
  System.out.println("Rata-rata nilai            : "+rataRata);

  if (rataRata<=60){System.out.println(":-(");
  }
  else {
   System.out.println(":-)");
  }
 } 
}
