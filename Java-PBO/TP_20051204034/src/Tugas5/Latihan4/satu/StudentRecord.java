/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5.Latihan4.satu;

/**
 *
 * @author rizqirazkafi
 */
public class StudentRecord {
    private String alamat;
private int umur;
private double matematika;
private double bahasainggris;
private double pengetahuanalam;
private double ratarata;
private static int studentCount;
    
    public String nama;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getMatematika() {
        return matematika;
    }

    public void setMatematika(double matematika) {
        this.matematika = matematika;
    }

    public double getBahasainggris() {
        return bahasainggris;
    }

    public void setBahasainggris(double bahasainggris) {
        this.bahasainggris = bahasainggris;
    }

    public double getPengetahuanalam() {
        return pengetahuanalam;
    }

    public void setPengetahuanalam(double pengetahuanalam) {
        this.pengetahuanalam = pengetahuanalam;
    }


//Menghasilkan nama dari Siswa
public String getNama(){
return nama;
}

//Mengubah nama siswa
public void setNama( String temp ){
nama = temp;
}

//Menghitung rata – rata nilai Matematika, Bahasa Inggris,dan Pengetahuan Alam
public double getRatarata(){
double result = 0;
result = ( matematika + bahasainggris + pengetahuanalam )/3;
return result;
}

//Menghasilkan jumlah instance StudentRecord
public static int getStudentCount(){
return studentCount;}
}
