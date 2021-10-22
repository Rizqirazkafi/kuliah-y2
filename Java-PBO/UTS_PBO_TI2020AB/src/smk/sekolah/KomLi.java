/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Vidi
 */
public class KomLi {
    private int kdKomLi;
    private String namaKomLi;
    private String namaKaKomLi;
    
    private BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    
    public KomLi (){
        System.out.println("Ini Constructor KomLi");
    }
    
    public void entryKomLi(){
            
            KomLi komLi = new KomLi();
            setNamaKomLi(""); setNamaKaKomLi("");
            
            try{
                System.out.println();
                System.out.print("Kode KomLi      : ");
                komLi.setKdKomLi(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Nama KomLi      : ");
                komLi.setNamaKomLi(getDataIn().readLine());
                System.out.print("Nama Ka. KomLi  : ");
                komLi.setNamaKaKomLi(getDataIn().readLine());
                
                
            }catch(IOException e){
		System.out.println("Terjadi Error!");
            }
            
            komLi.tampilKomLi(komLi.getKdKomLi(), komLi.getNamaKomLi(), 
                    komLi.getNamaKaKomLi());
            
    }
    
    public void tampilKomLi(int kdKomLi, String namaKomLi, String namaKaKomLi){
        System.out.println("Kode Prodi    : " + getKdKomLi());
        System.out.println("Nama Prodi    : " + getNamaKomLi());
        System.out.println("Nama Ka Prodi : " + getNamaKaKomLi());
    }

    
    /**
     * @return the dataIn
     */
    public BufferedReader getDataIn() {
        return dataIn;
    }

    /**
     * @param dataIn the dataIn to set
     */
    public void setDataIn(BufferedReader dataIn) {
        this.dataIn = dataIn;
    }

    /**
     * @return the kdKomLi
     */
    public int getKdKomLi() {
        return kdKomLi;
    }

    /**
     * @param kdKomLi the kdKomLi to set
     */
    public void setKdKomLi(int kdKomLi) {
        this.kdKomLi = kdKomLi;
    }

    /**
     * @return the namaKomLi
     */
    public String getNamaKomLi() {
        return namaKomLi;
    }

    /**
     * @param namaKomLi the namaKomLi to set
     */
    public void setNamaKomLi(String namaKomLi) {
        this.namaKomLi = namaKomLi;
    }

    /**
     * @return the namaKaKomLi
     */
    public String getNamaKaKomLi() {
        return namaKaKomLi;
    }

    /**
     * @param namaKaKomLi the namaKaKomLi to set
     */
    public void setNamaKaKomLi(String namaKaKomLi) {
        this.namaKaKomLi = namaKaKomLi;
    }
}