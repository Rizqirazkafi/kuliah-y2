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
public class MataPelajaran {
    private String kdMapel;
    private String namaMMapel;
    private int sks;
    private String kelas;
    private String guruPengampu;
     
    public void entryMataPelajaran(){
        
    }
    
    public void tampilMataPelajaran(){
        
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
