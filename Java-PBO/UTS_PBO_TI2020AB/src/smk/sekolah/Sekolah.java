/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smk.sekolah;

/**
 *
 * @author Vidi
 */
public class Sekolah {
 
    private String nama;
    private int kodeSek;
    private boolean status;
    private String NISS;
    private String namaKepSek; 
    private String namaWaka1;
    private String namaWaka2;
    private String namaWaka3;
    private String namaWaka4;
    
    public Sekolah(String nama){
        System.out.println("Ini Constructor Sekolah");
        System.out.println("Nama Sekolah : "+ getNama());
    }
    
    public Sekolah (){
        System.out.println("Ini Constructor Sekolah");
    }
            
    public void tampilSekolah(String nama, int kodeSek, boolean status, 
        String NISS, String namaKepSek, String namaWaka1, String namaWaka2,
        String namaWaka3, String namaWaka4){
                System.out.println("Nama Sekolah    : "+ getNama());
                System.out.println("Kode Sekolah    : "+ getKodeSek());
                String ket1;
                if (status == true)
                    ket1 = "Negeri";
                else
                    ket1 = "Swasta";
                System.out.println("Status PT       : "+ ket1);
                System.out.println("Nomer Induk1 PT : "+ getNISS());
                System.out.println("Nama Rektor     : "+ getNamaKepSek());
                System.out.println("Nama Rektor 1   : "+ getNamaWaka1());        
                System.out.println("Nama Rektor 2   : "+ getNamaWaka2());
                System.out.println("Nama Rektor 3   : "+ getNamaWaka3());
                System.out.println("Nama Rektor 4   : "+ getNamaWaka4());
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
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the kodeSek
     */
    public int getKodeSek() {
        return kodeSek;
    }

    /**
     * @param kodeSek the kodeSek to set
     */
    public void setKodeSek(int kodeSek) {
        this.kodeSek = kodeSek;
    }

    /**
     * @return the NISS
     */
    public String getNISS() {
        return NISS;
    }

    /**
     * @param NISS the NISS to set
     */
    public void setNISS(String NISS) {
        this.NISS = NISS;
    }

    /**
     * @return the namaKepSek
     */
    public String getNamaKepSek() {
        return namaKepSek;
    }

    /**
     * @param namaKepSek the namaKepSek to set
     */
    public void setNamaKepSek(String namaKepSek) {
        this.namaKepSek = namaKepSek;
    }

    /**
     * @return the namaWaka1
     */
    public String getNamaWaka1() {
        return namaWaka1;
    }

    /**
     * @param namaWaka1 the namaWaka1 to set
     */
    public void setNamaWaka1(String namaWaka1) {
        this.namaWaka1 = namaWaka1;
    }

    /**
     * @return the namaWaka2
     */
    public String getNamaWaka2() {
        return namaWaka2;
    }

    /**
     * @param namaWaka2 the namaWaka2 to set
     */
    public void setNamaWaka2(String namaWaka2) {
        this.namaWaka2 = namaWaka2;
    }

    /**
     * @return the namaWaka3
     */
    public String getNamaWaka3() {
        return namaWaka3;
    }

    /**
     * @param namaWaka3 the namaWaka3 to set
     */
    public void setNamaWaka3(String namaWaka3) {
        this.namaWaka3 = namaWaka3;
    }

    /**
     * @return the namaWaka4
     */
    public String getNamaWaka4() {
        return namaWaka4;
    }

    /**
     * @param namaWaka4 the namaWaka4 to set
     */
    public void setNamaWaka4(String namaWaka4) {
        this.namaWaka4 = namaWaka4;
    }

       

}
