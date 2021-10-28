/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

/**
 *
 * @author bamba
 */
public class Guru extends Pegawai {
    private String ijazahTerakhir;
    private String pengampuMapel;
    private String bidangKomp;

    public Guru() {
        System.out.println("Dalam Constructor Dosen");
    }

    public Guru(String nama, String nip) {
        super(nama, nip);
    }

 

    public Guru(String ijazah, String ampuMapel, String bidangKomp) {
        ijazahTerakhir = ijazah;
        pengampuMapel = ampuMapel;
        this.bidangKomp = bidangKomp;
    }

    public void entryGuru() {
        try {
            System.out.println("====================");
            System.out.print("Masukkan Nama Guru: ");
            setNama(getDataIn().readLine());
            System.out.print("Masukkan NIP Guru: ");
            setNip(getDataIn().readLine());
            System.out.print("Masukkan Ijazah Terakhir: ");
            setIjazahTerakhir(getDataIn().readLine());
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void tampilGuru(String ijazahTerakhir, String pengampuMapel, String bidangKomp, String nama, String nip) {
        
        System.out.println("Nama Guru               : " + getNama());
        System.out.println("NIP Guru                : " + getNip());
        System.out.println("Ijazah                  : " + getIjazahTerakhir());
        System.out.println("Pengampu Mata Pelajaran : " + getPengampuMapel());
        System.out.println("Bidang Kompetensi       : " + getBidangKomp());
    }

    /**
     * @return the bidangKomp
     */
    public String getBidangKomp() {
        return bidangKomp;
    }

    /**
     * @param bidangKomp the bidangKomp to set
     */
    public void setBidangKomp(String bidangKomp) {
        this.bidangKomp = bidangKomp;
    }

    /**
     * @return the ijazahTerakhir
     */
    public String getIjazahTerakhir() {
        return ijazahTerakhir;
    }

    /**
     * @param ijazahTerakhir the ijazahTerakhir to set
     */
    public void setIjazahTerakhir(String ijazahTerakhir) {
        this.ijazahTerakhir = ijazahTerakhir;
    }

    /**
     * @return the pengampuMapel
     */
    public String getPengampuMapel() {
        return pengampuMapel;
    }

    /**
     * @param pengampuMapel the pengampuMapel to set
     */
    public void setPengampuMapel(String pengampuMapel) {
        this.pengampuMapel = pengampuMapel;
    }

}
