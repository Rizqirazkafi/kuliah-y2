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

public class TugasPBO {
    
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

            String name = "";
            Integer categories =1;
            String categoriesOut = ""; 
            Integer processorVendor = 1 ; 
            String processorVendorOut = "" ; 
            String processorType = "";
            Integer RAMSizeInGB = 0; 
            Integer diskType = 1; 
            String diskTypeOut = ""; 
            Integer diskZiseInGB = 0; 
    
    try{
            System.out.print("Masukkan nama produk: ");
            name = dataIn.readLine();
            System.out.print("1. Laptop \n"); 
            System.out.print("2. Built Up PC \n"); 
            System.out.print("Masukkan kategori produk: "); 
            categories = Integer.parseInt(dataIn.readLine()) ;
            if(categories == 1){
                categoriesOut = "Laptop";
            }else if (categories == 2){
                categoriesOut = "Built Up PC";  
            } 
            System.out.print("1. Intel \n");
            System.out.print("2. AMD \n");
            System.out.print("Masukkan vendor processor: ");
            processorVendor = Integer.parseInt(dataIn.readLine()); 
            if(processorVendor == 1){
                processorVendorOut = "Intel"; 
            }else if(processorVendor == 2 ){
                processorVendorOut = "AMD"; 
            }
            System.out.print("Masukkan ukuran ram (GB): ");
            RAMSizeInGB = Integer.parseInt(dataIn.readLine()); 
            System.out.print("Masukkan tipe processor: ");
            processorType = dataIn.readLine(); 
            System.out.print("1. HDD \n");
            System.out.print("2. SSD \n");
            System.out.print("Masukkan tipe penyimpanan: ");
            diskType  = Integer.parseInt(dataIn.readLine()); 
            if(diskType  == 1){
                diskTypeOut  = "HDD"; 
            }else if(diskType  == 2 ){
                diskTypeOut  = "SSD"; 
            }
            System.out.print("Masukkan ukuran penyimpanan (GB): ");
            diskZiseInGB   = Integer.parseInt(dataIn.readLine()); 
    }catch(IOException e){
        System.out.println("Maaf ada error"); 
    }
            System.out.println("Nama produk : "+ name);
            System.out.println("Kategori produk : "+ categoriesOut );
            System.out.println("Vendor processor produk : "+ processorVendorOut  );
            System.out.println("Tipe processor produk : "+ processorType );
            System.out.println("RAM produk : "+ RAMSizeInGB + "GB");
            System.out.println("Tipe penyimpanan produk : "+ diskTypeOut );
            System.out.println("Ukuran penyimpanan produk : "+ diskZiseInGB +"GB" );

    }

}
