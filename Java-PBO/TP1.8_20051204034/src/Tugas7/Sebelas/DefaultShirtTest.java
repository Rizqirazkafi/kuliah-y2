/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7.Sebelas;

/**
 *
 * @author user
 */
public class DefaultShirtTest {
   public static void main(String[] args) {
        DefaultShirt defShirt=new DefaultShirt();
        char kodeWarna;
        kodeWarna=defShirt.getKodeWarna();
        System.out.println("Kode Warna: "+kodeWarna);
    } 
}
