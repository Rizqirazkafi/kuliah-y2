/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

import java.io.IOException;

/**
 *
 * @author bamba
 */
public class Pustakawan extends Laboran{
    // private String pustakawan;
    private String katalog;
    private String judulBuku;
    private int jmlBuku;
    private boolean dipinjam;
    
    public Pustakawan(){
        System.out.println("Dalam Constructor Pustakawan");
    }
    
    public void tampilPustakawan(){
        System.out.println("Katalog     : " + getKalaog());
        System.out.println("Judul Buku  : " + getJudulBuku());
        System.out.println("Jumlah Buku : " + getJmlBuku());
        System.out.println("Status      : " + getDipinjam());
    }
    
    public void entryPustakawan(){
        try{
            System.out.print("Masukkan katalog      : ");
            setKatalog(getDataIn().readLine()); 
            System.out.print("Masukkan Judul Buku   : ");
            setJudulBuku(getDataIn().readLine()); 
            System.out.print("Masukkan Jumlah Buku  : ");
            setJmlBuku(Integer.parseInt(getDataIn().readLine()));
            System.out.print("Di pinjam/ tidak (true/false): ");
            setDipinjam(Boolean.parseBoolean(getDataIn().readLine()));
        } catch(IOException e){
            System.out.println("Error");
        }
        
    }

    public void setKatalog(String katalog){
        this.katalog = katalog;
    }

    public String getKalaog(){
        return katalog;
    }

    public void setJudulBuku(String judulBuku){
        this.judulBuku =judulBuku;
    }

    public String getJudulBuku(){
        return judulBuku;
    }

    public void setJmlBuku(Integer jmlBuku){
        this.jmlBuku = jmlBuku;
    }

    public Integer getJmlBuku(){
        return jmlBuku;
    }

    public void setDipinjam(Boolean dipinjam){
        this.dipinjam = dipinjam;
    }

    public Boolean getDipinjam(){
        return dipinjam;
    }
    
    
}
