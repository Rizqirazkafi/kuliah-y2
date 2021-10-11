package Latihan;

public class BukuAlamatExec {

    private static BukuAlamatDB alamatDB = new BukuAlamatDB();
    private static BukuAlamatInput input = new BukuAlamatInput();
    public static void main(String[] args) {
        
    }
    
    public static void alamat(){
        BukuAlamat[] listAlamat = alamatDB.getAlamat();
        if(listAlamat.length == 0) {
            System.out.println("Tidak ada alamat");
        }
        for(int i = 0; i < listAlamat.length; i++){
            BukuAlamat alamat = listAlamat[i];
        }
    }
}
