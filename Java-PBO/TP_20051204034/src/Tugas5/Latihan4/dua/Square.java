/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5.Latihan4.dua;

/**
 *
 * @author rizqirazkafi
 */
public class Square extends Shape {
    private int sisi;
Square(String nama) {
super(nama);
sisi = 7;   
}
float getArea() {
float luas;
luas = sisi * sisi;
return luas;
}
}
