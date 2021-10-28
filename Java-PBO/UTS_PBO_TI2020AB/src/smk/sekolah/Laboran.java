/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

import java.io.IOException;

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
        try{
            System.out.print("Nama  : ");
            setNama(getDataIn().readLine());
            System.out.print("NIP   :");
            setNip(getDataIn().readLine());

        }catch(IOException e){
            System.out.println("Error in Entery laboran"); 
        }
    }
    
    public void tampilLaboran(){
        System.out.println("Nama pegawai    : " + getNama()); 
        System.out.println("NIP  pegawai    : " + getNip()); 
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
