package com.latihanEmpat.Empat;
import java.util.Scanner;
public class DoWhilePangkat {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float angka, pangkat;
        float hasil = 1;
        int a = 1;

        System.out.print("Masukkan angka    : ");
        angka = input.nextFloat();
        System.out.print("Masukkan pangkat  : ");
        pangkat = input.nextFloat();

        do {
            hasil=hasil*angka;
            a++;
        }while (a<=pangkat);
        System.out.print("hasil dari "+angka+" pangkat "+pangkat+" = "+hasil);
    } 
}
