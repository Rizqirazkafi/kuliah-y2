/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7.Dua;

/**
 *
 * @author user
 */
public class StudentRecordExample {
       public static void main(String[]args){
       //membuat object StudentRecord 
       StudentRecord annaRecord = new StudentRecord();
       //memberi nama siswa
       annaRecord.setName("Name : Anna");
       System.out.println( annaRecord.getName());
       annaRecord.setAdress("Adress : Filipina");
       System.out.println( annaRecord.getAdress());
       annaRecord.setAge(15);
       System.out.println( annaRecord.getAge());
       annaRecord.setMathGrade(80);
       System.out.println( annaRecord.getMathGrade());
       annaRecord.setEnglishGrade(90);
       System.out.println( annaRecord.getEnglishGrade());
       annaRecord.setScienceGrade(95);
       System.out.println( annaRecord.getScienceGrade());
       
       //menampilkan jumlah siswa
       System.out.println("Count="+StudentRecord.getStudentCount());
    } 
}
