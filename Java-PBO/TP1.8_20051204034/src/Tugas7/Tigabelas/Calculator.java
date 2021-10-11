/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7.Tigabelas;

/**
 *
 * @author user
 */
public class Calculator {
        public int sum(int numberOne, int numberTwo){
        System.out.println("Method One");
        return numberOne+numberTwo;
    }
    public float sum(float numberOne, float numberTwo){
        System.out.println("Method Two");
        return numberOne+numberTwo;
    }
    public float sum(int numberOne, float numberTwo){
        System.out.println("Method Three");
        return numberOne+numberTwo;
    }
}
