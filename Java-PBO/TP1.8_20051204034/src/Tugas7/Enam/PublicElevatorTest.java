/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7.Enam;

/**
 *
 * @author user
 */
public class PublicElevatorTest {
    public static void main(String args[]){
        PublicElevator pubElevator = new PublicElevator();
        pubElevator.bukaPintu = true; //penumpang masuk
        pubElevator.bukaPintu = false; //pintu tutup
        //pergi ke lantai 0 dibawah gedung
        pubElevator.lantaiSkrg--;
        pubElevator.lantaiSkrg++;
        //lompat ke lantai 7(hanya ada 5 lantai dalam gedung)
        pubElevator.lantaiSkrg = 7;
        pubElevator.bukaPintu = true; //penumpang masuk/keluar
        pubElevator.bukaPintu = false; 
        pubElevator.lantaiSkrg = 1; //menuju lantai pertama
        pubElevator.bukaPintu = true; //penumpang masuk/keluar
        pubElevator.lantaiSkrg++; //elevator bergerak tanpa menutup pintu
        pubElevator.bukaPintu = false;
        pubElevator.lantaiSkrg--;
        pubElevator.lantaiSkrg--;
    }   
}
