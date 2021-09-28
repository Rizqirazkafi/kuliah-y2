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
abstract class Shape {
private String nm;
Shape(String nama) {
nm = nama; }
public String getName() {
return nm;
}
abstract float getArea();
}

