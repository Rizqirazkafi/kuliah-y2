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
public class Circle extends Shape {
    int r;
Circle(String nama) {
super(nama);
r= 7;
}
float getArea() {
float luas;
luas = (float)(3.14 * r * r);
return luas;
}
}
