/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rizqirazkafi
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class GetInputFromKeyboard {
    
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); 

            String name = "";
            String keterangan = "";  
            Integer umur = 0; 
            Integer thnLahir = 0;
            Boolean jenKel = false; 
     try{
            System.out.print("Masukkan nama anda : ");
            name = dataIn.readLine();
            System.out.print("Masukkan umur anda: "); 
            umur = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan Tahun lahir anda: "); 
            thnLahir = Integer.parseInt(dataIn.readLine()); 
            System.out.print("Masukkan jenis kelamin anda : "); 
            jenKel = Boolean.parseBoolean(dataIn.readLine()); 
            if (jenKel == true){
                keterangan = "laki-laki"; 
            }else{ 
                keterangan = "perempuan";
            }
     }catch(IOException e){
        System.out.println("Maaf ada error"); 
     }      
        System.out.println("Hello " + name + "!"); 
        System.out.println("Umur Anda = " + umur + " tahun"); 
        System.out.println("Tahun lahir Anda = " + thnLahir ); 
        System.out.println("Jenis kelamin Anda = " + keterangan ); 
    }
}
