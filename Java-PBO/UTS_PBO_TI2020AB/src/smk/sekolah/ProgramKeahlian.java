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
public class ProgramKeahlian {
    private String namaProgLi;
    private String nmSingkatan;
    private int kodeProgLi;
    private int jumlahKomLi;
    private int jumlahGuru;
    private int kdKomLi1, kdKomLi2, kdKomLi3;
        
    private BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));     
    
        public ProgramKeahlian(){
            System.out.println("Ini Constructor Fakultas");
        }
        
    public void entryProgLi(){
            
            ProgramKeahlian tki = new ProgramKeahlian();
            ProgramKeahlian tik = new ProgramKeahlian();
            setNamaProgLi("");
            
            try{
                System.out.println();  
                System.out.print("Nama Program Keahlian   : ");
                tki.setNamaProgLi(getDataIn().readLine());
                System.out.print("Nama Singkatan : ");
                tki.setNmSingkatan(getDataIn().readLine());
                System.out.print("Kode ProgLi   : ");
                tki.setKodeProgLi(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Kode KomLi 1  : ");
                tki.setKdKomLi1(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Kode KomLi 2  : ");
                tki.setKdKomLi2(Integer.parseInt(getDataIn().readLine()));
                System.out.print("Kode KomLi 3  : ");
                tki.setKdKomLi3(Integer.parseInt(getDataIn().readLine()));
                
            }catch(IOException e){
		System.out.println("Terjadi Error!");
            }
            
            tki.tampilProgLi(tki.getNamaProgLi(), tki.getNmSingkatan(), 
                  tki.getKodeProgLi(), tki.getJumlahKomLi(),tki.getJumlahGuru(), 
                  tki.getKdKomLi1(), tki.getKdKomLi2(),tki.getKdKomLi3());
            
    }
        public void tampilProgLi(String namaProgLi, String nmSingkatan, int kodeProgLi, int jumlahJurusan,
                int jumlahGuru, int kdKomLi1, int kdKomLi2, int kdKomLi3){
            
            System.out.println();
            System.out.println("Nama Fakultas   : " + "Fakultas "+namaProgLi+"("+nmSingkatan+")");
            System.out.println("Kode Fakultas   : " + kodeProgLi);
            System.out.println("Jumlah Jurusan  : " + getJumlahKomLi()+" Pogram Keahlian");
            System.out.println("Jumlah Dosen    : " + jumlahGuru+" guru");
            String ket1, ket2, ket3, ket4, ket5;
            
            if (kdKomLi1== 51)
                ket1 = "Jurusan Teknik Elektro";
            else
                ket1 = "Lain - Lain"; 
            System.out.println("Kode Jurusan 1  : " + kdKomLi1+"("+ket1+")");
                
            if (kdKomLi2 == 52)
                ket2 = "Jurusan Teknik Sipil";
            else
                ket2 = "Lain - Lain";
            System.out.println("Kode Jurusan 2  : " + kdKomLi2+"("+ket2+")");
            
            if (kdKomLi3 == 53)
                ket3 = "Jurusan Teknik Mesin";
            else
                ket3 = "Lain - Lain";
            System.out.println("Kode Jurusan 3  : " + kdKomLi3+"("+ket3+")");
            
            }

    /**
     * @return the namaProgLi
     */
    public String getNamaProgLi() {
        return namaProgLi;
    }

    /**
     * @param namaProgLi the namaProgLi to set
     */
    public void setNamaProgLi(String namaProgLi) {
        this.namaProgLi = namaProgLi;
    }

    /**
     * @return the nmSingkatan
     */
    public String getNmSingkatan() {
        return nmSingkatan;
    }

    /**
     * @param nmSingkatan the nmSingkatan to set
     */
    public void setNmSingkatan(String nmSingkatan) {
        this.nmSingkatan = nmSingkatan;
    }

    /**
     * @return the kodeProgLi
     */
    public int getKodeProgLi() {
        return kodeProgLi;
    }

    /**
     * @param kodeProgLi the kodeProgLi to set
     */
    public void setKodeProgLi(int kodeProgLi) {
        this.kodeProgLi = kodeProgLi;
    }

    /**
     * @return the jumlahKomLi
     */
    public int getJumlahKomLi() {
        return jumlahKomLi;
    }

    /**
     * @param jumlahKomLi the jumlahKomLi to set
     */
    public void setJumlahKomLi(int jumlahKomLi) {
        this.jumlahKomLi = jumlahKomLi;
    }

    /**
     * @return the jumlahGuru
     */
    public int getJumlahGuru() {
        return jumlahGuru;
    }

    /**
     * @param jumlahGuru the jumlahGuru to set
     */
    public void setJumlahGuru(int jumlahGuru) {
        this.jumlahGuru = jumlahGuru;
    }

    /**
     * @return the kdKomLi1
     */
    public int getKdKomLi1() {
        return kdKomLi1;
    }

    /**
     * @param kdKomLi1 the kdKomLi1 to set
     */
    public void setKdKomLi1(int kdKomLi1) {
        this.kdKomLi1 = kdKomLi1;
    }

    /**
     * @return the kdKomLi2
     */
    public int getKdKomLi2() {
        return kdKomLi2;
    }

    /**
     * @param kdKomLi2 the kdKomLi2 to set
     */
    public void setKdKomLi2(int kdKomLi2) {
        this.kdKomLi2 = kdKomLi2;
    }

    /**
     * @return the kdKomLi3
     */
    public int getKdKomLi3() {
        return kdKomLi3;
    }

    /**
     * @param kdKomLi3 the kdKomLi3 to set
     */
    public void setKdKomLi3(int kdKomLi3) {
        this.kdKomLi3 = kdKomLi3;
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
        
        
}