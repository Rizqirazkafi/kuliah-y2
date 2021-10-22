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
public class Pustakawan extends Laboran{
    private String pustakawan;
    private String katalog;
    private String judulBuku;
    private int jmlBuku;
    private boolean dipinjam;
    
    public Pustakawan(){
        System.out.println("Dalam Constructor Pustakawan");
    }
    
    public void tampilPustakawan(){
        
    }
    
    public void entryPustakawan(){
        
    }

    /**
     * @return the pustakawan
     */
    public String getPustakawan() {
        return pustakawan;
    }

    /**
     * @param pustakawan the pustakawan to set
     */
    public void setPustakawan(String pustakawan) {
        this.pustakawan = pustakawan;
    }
    
}
