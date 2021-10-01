package com.latihan.satu;

public class satu {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int i = 0;
        
        System.out.println("Using While loop: \n");    
        while(i < days.length){
            System.out.println(days[i]);
            i++; 
        }
        System.out.println("\n");
        System.out.println("Using For loop: \n");    
        for(i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }
        System.out.println("\n");
        System.out.println("Using Do-While loop: \n");    
        i = 0;
        do{
            System.out.println(days[i]);
            i++;
        }while(i< days.length);
    }    
}
