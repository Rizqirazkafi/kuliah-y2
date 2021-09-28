/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5.tiga;

/**
 *
 * @author user
 */
public class Employee extends Person{
    public String getName() {
        System.out.println("Employee Name:" +name);
        return name;
    }
    public static void main(String[] args)
    {
        Person ref;
        Student studentObject = new Student();
        Employee employeeObject = new Employee();
        
        ref =  studentObject;//Person menunjuk kepada object Student
        
        String temp = ref.getName(); //getName dari Student class dipanggil
        System.out.println(temp);
        
        ref = employeeObject; //Person menunjuk kepada object Employee
        
        temp = ref.getName() ; //getName dari Employee class dipanggil
        System.out.println(temp);
    }
}

