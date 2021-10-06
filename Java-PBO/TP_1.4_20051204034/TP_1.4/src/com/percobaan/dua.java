package com.percobaan;

public class dua {
    public static void main(String[] args) {
        int grade = 92;
        switch (grade) {
            case 100:
                System.out.println("Excelent!");
                break;
            case 90:
                System.out.println("Good job!");
                break;
            case 80:
                System.out.println("Study harder!");
                break;

            default:
                System.out.println("Sorry, you've failed.");
                break;
        }
    }
}
