/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5.empat;

/**
 *
 * @author user
 */
public class PrivateElevator2Test {
    public static void main(String args[]) {
        PrivateElevator2 privElevator = new PrivateElevator2();
        privElevator.buka();
        privElevator.tutup();
        privElevator.turun();
        privElevator.naik();
        privElevator.naik();
        privElevator.buka();
        privElevator.tutup();
        privElevator.turun();
        privElevator.buka();
        privElevator.turun();
        privElevator.tutup();
        privElevator.turun();
        privElevator.turun();
        int lantai = privElevator.getLantai();
        if (lantai != 5 && !privElevator.getStatusPintu()) {
            privElevator.setLantai(5);
        }
        privElevator.setLantai(10);
        privElevator.buka();
    }
    
}
