/*
 * @author rizqirazkafi
 *
 */

package src;

public class Laptop{
    private String merek;
    private String proc;
    private Integer Ram;
    private Integer diskSizeinGB;

    public void setMerek(String value){
        this.merek = value; 
    }
    public String getMerek()
    {
        return this.merek;
    }
    public void setProc(String value){
        this.proc = value; 
    }
    public String getProc()
    {
        return this.proc;
    }
    public void setRAM(Integer value){
        this.Ram = value; 
    }
    public Integer getRAM()
    {
        return this.Ram;
    }
    public void setdiskSizeinGB(Integer value){
        this.diskSizeinGB = value; 
    }
    public Integer getdiskSizeinGB()
    {
        return this.diskSizeinGB;
    }



}
