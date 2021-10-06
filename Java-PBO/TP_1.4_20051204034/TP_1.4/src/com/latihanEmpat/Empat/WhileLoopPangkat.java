package com.latihanEmpat.Empat;
import java.util.Scanner;

public class WhileLoopPangkat {
       public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float angka,pangkat;
        float hasil=1;
        int a=1;

        System.out.print("Masukkan angka    : ");
        angka=input.nextFloat();
        System.out.print("Masukkan pangkat  : ");
        pangkat=input.nextFloat();

        while (a<=pangkat){
            hasil=hasil*angka;
            a++;
        }
        System.out.print("hasil dari "+angka+" pangkat "+pangkat+" = "+hasil);
    }
}
