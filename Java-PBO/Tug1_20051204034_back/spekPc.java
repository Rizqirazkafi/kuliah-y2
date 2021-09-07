/**
 *
 *@author rizqirazkafi
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

class spekPc{
    Integer processorVendor = 0; 
    String processorVendorOut = ""; 
    Integer RAMSizeInGB =0;
    Integer diskZiseInGB = 0;
    Integer screenSizeInInch= 0;

    void insertData(){
         
        
         
    }

    void procVen(){
        if (processorVendor == 1){
            processorVendorOut = "Intel"; 
        }else if(processorVendor == 2) 
        {
            processorVendorOut = "AMD"; 
        }
    

        }
    void spitInfo(){
        System.out.print("Processor :" +processorVendorOut);
        System.out.print("RAM       : " + RAMSizeInGB); 
        System.out.print("Disk      : " + diskZiseInGB); 
        System.out.print("Screen    : " + screenSizeInInch); 

    } 


}
