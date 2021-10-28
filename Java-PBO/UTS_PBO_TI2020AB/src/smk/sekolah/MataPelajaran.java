/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedInputStream;

/**
 *
 * @author bamba
 */
public class MataPelajaran {
    private String kdMapel;
    private String namaMMapel;
    private int sks;
    private String kelas;
    private String guruPengampu;
    private BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
     
    public void entryMataPelajaran(){
        try{
            System.out.print("Kode Mapel            : ");
            setKdMapel(dataIn.readLine());
            System.out.print("Nama Mapel            : ");
            setNamaMMapel(dataIn.readLine());
            System.out.print("SKS  Mapel            : ");
            setSks(Integer.parseInt(dataIn.readLine()));
            System.out.print("Kelas Mapel           : ");
            setKelas(dataIn.readLine());
            System.out.print("Guru Pengampu Mapel   : ");
            setKelas(dataIn.readLine());
        }catch(IOException e){
            System.out.println("Error in Entry Mata Pelajaran");
        }
    }
    
    public void tampilMataPelajaran(){
            System.out.println("Kode Mapel            : " + getKdMapel());
            System.out.println("Nama Mapel            : " + getNamaMMapel());
            System.out.println("SKS  Mapel            : " + getSks());
            System.out.println("Kelas Mapel           : " + getKelas());
            System.out.println("Guru Pengampu Mapel   : " + getGuruPengampu());
        
    }

    /**
     * @return the sks
     */
    public int getSks() {
        return sks;
    }

    /**
     * @param sks the sks to set
     */
    public void setSks(int sks) {
        this.sks = sks;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * @return the kdMapel
     */
    public String getKdMapel() {
        return kdMapel;
    }

    /**
     * @param kdMapel the kdMapel to set
     */
    public void setKdMapel(String kdMapel) {
        this.kdMapel = kdMapel;
    }

    /**
     * @return the namaMMapel
     */
    public String getNamaMMapel() {
        return namaMMapel;
    }

    /**
     * @param namaMMapel the namaMMapel to set
     */
    public void setNamaMMapel(String namaMMapel) {
        this.namaMMapel = namaMMapel;
    }

    /**
     * @return the guruPengampu
     */
    public String getGuruPengampu() {
        return guruPengampu;
    }

    /**
     * @param guruPengampu the guruPengampu to set
     */
    public void setGuruPengampu(String guruPengampu) {
        this.guruPengampu = guruPengampu;
    }   
    
}
