/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5.dua;

/**
 *
 * @author user
 */
public class Baju extends Pakaian{
    //kode Warna R=Merah, B=B, G=Hijau, U=Belum Ditentukan
    public char kodeWarna = 'U';
    public Baju() {
        super.setHarga(1500.0);
        super.setJmlStok(5);
        super.setKeterangan("biru");
    }
    //Method ini menampilkan nilai untuk suatu item
    public void tampilInformasiBaju() {
        System.out.println("ID Baju: "+ getID());
        System.out.println("Keterangan: "+ getKeterangan());
        System.out.println("Kode Warna: "+ kodeWarna);
        System.out.println("Harga Baju: "+ getHarga());
        System.out.println("Jumlah Stok: "+ getJmlStok());
    }//akhir method display
    public static void main(String args[]) {
        Baju b=new Baju();
        b.tampilInformasiBaju();
    }
    
}//akhir kelas