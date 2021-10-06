package com.latihanEmpat.dua;
import java.util.Scanner;
public class SwitchCase {
     public static void main(String[] args) {
        Scanner UInput=new Scanner(System.in);
        int masukan;

        System.out.print("Pilih salah satu angka dari 1 - 10 : ");
        masukan=UInput.nextInt();
        switch (masukan){
            case 1:
                System.out.println("Input : "+masukan+" = Satu");
                break;
            case 2:
                System.out.println("Input : "+masukan+" = Dua");
                break;
            case 3:
                System.out.println("Input : "+masukan+" = Tiga");
                break;
            case 4:
                System.out.println("Input : "+masukan+" = Empat");
                break;
            case 5:
                System.out.println("Input : "+masukan+" = Lima");
                break;
            case 6:
                System.out.println("Input : "+masukan+" = Enam");
                break;
            case 7:
                System.out.println("Input : "+masukan+" = Tujuh");
                break;
            case 8:
                System.out.println("Input : "+masukan+" = Delapan");
                break;
            case 9:
                System.out.println("Input : "+masukan+" = Sembilan");
                break;
            case 10:
                System.out.println("Input : "+masukan+" = Sepuluh");
                break;
            default:
                System.out.println("Invalid Number");

        }
    }
    
}
