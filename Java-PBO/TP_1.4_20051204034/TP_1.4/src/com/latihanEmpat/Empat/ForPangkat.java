package com.latihanEmpat.Empat;
import java.util.Scanner;

public class ForPangkat {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float angka, pangkat;
        float hasil = 1;

        System.out.print("Masukkan angka    : ");
        angka=input.nextFloat();
        System.out.print("Masukkan pangkat  : ");
        pangkat=input.nextFloat();

        for (int a=1;a<=pangkat;a++){
            hasil=hasil*angka;
        }
        System.out.print("hasil dari "+angka+" pangkat "+pangkat+" = "+hasil);
    } 
}
