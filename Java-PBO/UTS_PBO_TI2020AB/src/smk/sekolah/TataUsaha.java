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
public class TataUsaha extends Pegawai{
    private String bagian;
    
    public TataUsaha(){
        System.out.println("Dalam Constructor TataUsaha");
    }
    
    
    public void entryTataUsaha(){
        
    }
    
    public void tampilTataUsaha(){
        
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
    
}
