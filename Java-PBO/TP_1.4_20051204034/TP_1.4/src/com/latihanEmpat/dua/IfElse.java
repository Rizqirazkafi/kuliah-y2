package com.latihanEmpat.dua;

import java.util.Scanner;

public class IfElse {
        public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int masukan;

        System.out.print("Pilih salah satu angka dari 1 - 10 : ");
        masukan=a.nextInt();
        if(masukan==1){
            System.out.println("Input : "+masukan+" = Satu");
        }
        else if (masukan==2){
            System.out.println("Input : "+masukan+" = Dua");
        }
        else if (masukan==3) {
            System.out.println("Input : "+masukan+" = Tiga");
        }
        else if (masukan==4) {
            System.out.println("Input : "+masukan+" = Empat");
        }
        else if (masukan==5) {
            System.out.println("Input : "+masukan+" = Lima");
        }
        else if (masukan==6) {
            System.out.println("Input : "+masukan+" = Enam");
        }
        else if (masukan==7) {
            System.out.println("Input : "+masukan+" = Tujuh");
        }
        else if (masukan==8) {
            System.out.println("Input : "+masukan+" = Delapan");
        }
        else if (masukan==9) {
            System.out.println("Input : "+masukan+" = Sembilan");
        }
        else if (masukan==10) {
            System.out.println("Input : "+masukan+" = Sepuluh");
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
