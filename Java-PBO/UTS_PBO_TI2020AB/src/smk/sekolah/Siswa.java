/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author bamba
 */
public class Siswa {
    private String nis;
    private String nama;
    private Boolean kelamin;
    private Integer agama;
    private Integer umur;
    private String alamat;
    private String noHP;
    private String email;
    
    private BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); 
    
    public Siswa(){
        System.out.println("Construktor Siswa");
    }
    
    public void entrySiswa(){
        Siswa siswa = new Siswa();
        setNama("");setNis("");setAlamat("");setNoHP("");setEmail("");
        
        try{
                System.out.println();
                System.out.print("Nama Siswa    : ");
                siswa.setNama(getDataIn().readLine());
                System.out.print("NIM Siswa     : ");
                siswa.setNis(getDataIn().readLine());
                System.out.print("Jenis Kelamin : ");
                siswa.setKelamin(Boolean.parseBoolean(getDataIn().readLine()));
                System.out.print("Agama         : ");
                siswa.setAgama(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Umur          : ");
                siswa.setUmur(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Alamat        : ");
                siswa.setAlamat(getDataIn().readLine());
                System.out.print("Nomor HP      : ");
                siswa.setNoHP(getDataIn().readLine());
                System.out.print("Email         : ");
                siswa.setEmail(getDataIn().readLine());
                
            }catch(IOException e){
		System.out.println("Terjadi Error!");
            }
        siswa.tampilSiswa(siswa.getNis(), siswa.getNama(), siswa.getKelamin(), 
                siswa.getAgama(), siswa.getUmur(), siswa.getAlamat(), siswa.getNoHP(),
                siswa.getEmail());           
 
    }
    
    public void tampilSiswa(String nim, String nama,Boolean kelamin, 
            Integer agama, Integer umur, String alamat, String noHP,String email){
            String ket1, ket2, ket3, ket4, ket5;
            
            System.out.println();
            System.out.println("NIS           : " + getNis());
            System.out.println("Nama Mahasiswa: " + getNama());
            
            if (getKelamin()== true)
                ket1 = "Laki-laki";
            else
                ket1 = "Perempuan";
            System.out.println("Jenis Kelamin : " + ket1);
            
            switch (getAgama()){
                case 1: ket2 = "Islam"; break;
                case 2: ket2 = "Budha"; break;
                case 3: ket2 = "Hindu"; break;
                case 4: ket2 = "Kristen"; break;
                case 5: ket2 = "Protestan"; break;
                default: ket2 = "Atheis";
            }
     
            System.out.println("Agama         : " + ket2);
            System.out.println("Umur          : " + getUmur()+" tahun");
            System.out.println("Alamat        : " + getAlamat());
            System.out.println("Nomor HP      : " + getNoHP());
            System.out.println("Alamat email  : " + getEmail());
            
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the kelamin
     */
    public Boolean getKelamin() {
        return kelamin;
    }

    /**
     * @param kelamin the kelamin to set
     */
    public void setKelamin(Boolean kelamin) {
        this.kelamin = kelamin;
    }

    /**
     * @return the agama
     */
    public Integer getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(Integer agama) {
        this.agama = agama;
    }

    /**
     * @return the umur
     */
    public Integer getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
     * @return the noHP
     */
    public String getNoHP() {
        return noHP;
    }

    /**
     * @param noHP the noHP to set
     */
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nis
     */
    public String getNis() {
        return nis;
    }

    /**
     * @param nis the nis to set
     */
    public void setNis(String nis) {
        this.nis = nis;
    }
    
}
