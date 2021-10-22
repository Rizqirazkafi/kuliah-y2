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
public class Pegawai {
    private String nip;//nip 18 digit
    private String nama;    
    private Integer umur;
    private Boolean kelamin;
    private Integer agama;
    private String alamat;
    private String noHP;
    private String email;
    private int jabatan;
    private String bagian;
    
    
    private BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); 
    
    public void entryPegawai(){      
            
            Pegawai tetap = new Pegawai();
            setNip("");setNama("");setAlamat("");setNoHP("");
            setEmail("");setBagian("");
            
            try{
                System.out.println();  
                System.out.print("NIP                : ");
                tetap.setNip(getDataIn().readLine());
                System.out.print("Nama Pegawai       : ");
                tetap.setNama(getDataIn().readLine());                
                System.out.print("Umur               : ");
                tetap.setUmur(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Jenis Kelamin      : ");
                tetap.setKelamin(Boolean.parseBoolean(getDataIn().readLine()));
                System.out.println("1. Islam, 2. Kristen, 3 Protestan, 4. Hindu, 5. Budha, 6. Kong Huchu");
                System.out.print("Agama              : ");
                tetap.setAgama(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Alamat             : ");
                tetap.setAlamat(getDataIn().readLine());
                System.out.print("Nomor HP(SmatPhone): ");
                tetap.setNoHP(getDataIn().readLine());
                System.out.print("Email              : ");
                tetap.setEmail(getDataIn().readLine());
                System.out.print("Jabatan            : ");
                tetap.setJabatan(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Bagian/penempatan) : ");
                tetap.setBagian((getDataIn().readLine()));                
                
            }catch(IOException e){
		System.out.println("Terjadi Error!");
            }
            
            tetap.tampilPegawai(tetap.getNip(), tetap.getNama(), tetap.getUmur(), 
                    tetap.getKelamin(), tetap.getAgama(), tetap.getAlamat(), tetap.getNoHP(), 
                    tetap.getEmail(), tetap.getJabatan(), tetap.getBagian());
    }
    
    public void tampilPegawai(String nip, String nama, Integer umur, Boolean kelamin, 
            Integer agama, String alamat, String noHP, String email, int jabatan, 
            String bagian){
        
            String ket1, ket2, ket3;            
            System.out.println();
            System.out.println("NIP                : " + nip);
            System.out.println("Nama Pegawai       : " + nama);            
            System.out.println("Umur               : " + umur+" tahun");
            
            if (kelamin== true)
                ket1 = "Laki-laki";
            else 
                ket1 = "Perempuan";
            System.out.println("Jenis Kelamin      : " + ket1);
            
            switch (agama){
                case 1: ket2 = "Islam";
                break;
                case 2: ket2 = "Kristen";
                break;
                case 3: ket2 = "Protestan";
                break;
                case 4: ket2 = "Hindu";
                break;
                case 5: ket2 = "Budha";
                break;
                default: ket2 = "Kepercayaan";
            }
            
            System.out.println("Agama              : " + ket2);            
            System.out.println("Alamat             : "+ alamat);
            System.out.println("Nomor HP/Smartphone: "+ noHP);
            System.out.println("Alamat email       : "+ email);
            
            switch (jabatan){
                case 1: ket3 = "Struktural";
                break;
                case 2: ket3 = "Fungsional";
                break;
                case 3: ket3 = "Tata Usaha";
                break;
                case 4: ket3 = "Guru";
                break;
                case 5: ket3 = "Laboran";
                break;
                default: ket3 = "Lain-lain";
            }
            System.out.println("Jabatan            : "+ ket3);
            System.out.println("Bagian/ditempatkan : " + bagian);
            
}

    public Pegawai(){
        System.out.println("Ini Constructor Pegawai");
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
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
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
     * @return the bagian
     */
    public String getBagian() {
        return bagian;
    }

    /**
     * @param bagian the bagian to set
     */
    public void setBagian(String bagian) {
        this.bagian = bagian;
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
     * @return the jabatan
     */
    public int getJabatan() {
        return jabatan;
    }

    /**
     * @param jabatan the jabatan to set
     */
    public void setJabatan(int jabatan) {
        this.jabatan = jabatan;
    }
    
}
