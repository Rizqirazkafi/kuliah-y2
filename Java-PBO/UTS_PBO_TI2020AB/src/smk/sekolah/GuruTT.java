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
public class GuruTT extends Guru{
    private String mapel;
    private String ijazah;
    private int lama;
    
    public GuruTT(){
        System.out.println("Dalam Constructor Guru Tidak Tetap");
    }
    
    public GuruTT(String mapel){
        this.mapel = mapel;
    }
    
    public GuruTT(String mapel, int lama){
        this.mapel = mapel;
        this.lama = lama;
    }
    
    public GuruTT(String mapel, String ijazah, int lama){
        this.mapel = mapel;
        this.ijazah = ijazah;
        this.lama = lama;
    }
    

    /**
     * @return the lama
     */
    public int getLama() {
        return lama;
    }

    /**
     * @param lama the lama to set
     */
    public void setLama(int lama) {
        this.lama = lama;
    }

    /**
     * @return the mapel
     */
    public String getMapel() {
        return mapel;
    }

    /**
     * @param mapel the mapel to set
     */
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    /**
     * @return the ijazah
     */
    public String getIjazah() {
        return ijazah;
    }

    /**
     * @param ijazah the ijazah to set
     */
    public void setIjazah(String ijazah) {
        this.ijazah = ijazah;
    }
    
}
