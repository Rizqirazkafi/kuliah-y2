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
public class StudentRecordExample {
     public static void main( String[] args ){
StudentRecord UcupRecord = new StudentRecord();

//Memberi nama siswa
UcupRecord.setNama("Ucup");

//Menampilkan nama siswa
System.out.println(UcupRecord.getNama() );

//Menampilkan jumlah siswa
System.out.println("Count= "+StudentRecord.getStudentCount());
}
}
