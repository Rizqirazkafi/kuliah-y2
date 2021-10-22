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
public class Laboran extends Pegawai{
    private String laboran;
    
    public Laboran(){
        System.out.println("Dalam Constructor laboran");
    }
    
    public void entryLaboran(){
        
    }
    
    public void tampilLaboran(){
        
    }

    /**
     * @return the laboran
     */
    public String getLaboran() {
        return laboran;
    }

    /**
     * @param laboran the laboran to set
     */
    public void setLaboran(String laboran) {
        this.laboran = laboran;
    }
    
}
