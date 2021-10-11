package Latihan;

public class BukuAlamat {
    private String nama;
    private String alamat;
    private String telp;
    private String email;

    public String getNama(){
        return this.nama;
    }
    public void setNama(String temp) {
        this.nama = temp;
    }

    public String getAlamat(){
        return this.alamat;
    }
    public void setAlamat(String temp) {
        this.alamat = temp;
    }

    public String getTelp(){
        return this.telp; 
    }

    public void setTelp(String temp){
        this.telp = temp;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String temp) {
        this.email = temp;
    }

}
