/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7.Sembilan;

/**
 *
 * @author user
 */
public class PrivateShirt2Test {
        public static void main(String[] args) {
        PrivateShirt2 privShirt=new PrivateShirt2();
        char kodeWarna;
        //Mengisi kode warna yang valid
        privShirt.setKodeWarna('R');
        kodeWarna=privShirt.getKodeWarna();
        //Kelas Private Shirt2Test bisa mengisi sebuah kodeWarna yang valid
        System.out.println("Kode Warna: "+kodeWarna);
        //Mengisi kode warna yang salah
        privShirt.setKodeWarna('Z');
        kodeWarna= privShirt.getKodeWarna();
        //Kelas Private Shirt2Test bisa mengisi sebuah kodeWarna yang salah
        //Kode warna masih R
        System.out.println("Kode Warna: "+kodeWarna);
    }
}
