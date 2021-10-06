package com.percobaan;

public class tiga {
    public static void main(String[] args) {
        String names[] = {"Beah", "Bianca", "Lance", "Belle", "Nico", "Yea", "Gem", "Ethan"};
        String searchName = "Yea";
        boolean foundName = false;
        for(int i=0; i<names.length;i++){
            if(names[i].equals(searchName)){
                foundName = true;
                break;
            }
        }
        if(foundName){
            System.out.println(searchName + " found!");
        }else{
            System.out.println(searchName + " not found.");
        }
    } 
}
