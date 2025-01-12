package com.thailand.dti;

import java.util.Scanner;

public class ByeBye {
    public static void main(String[] args) {
        //สร้างตัวเเปร variable => ชนิดข้อมูล ตัวเเปร;
        String yourName;
        //เลขจำนวนเต็ม byte short int long
        int yourAge;
        //เลขจำนวนจริง float double
        double yourSalary;
        
        // input รับค่า โดยใช้ Scanner จะสร้างตัวเเทนของคลาส Scanner ขึ้นมา
        //เรียกว่า Objact หรือเรียกว่า Instance of Class
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter yuor name");
        yourName = sc.next();
        System.out.print("Enter yuor age");
        yourAge = sc.nextInt();
        System.out.print("Enter yuor salary");
        yourSalary = sc.nextDouble();
        System.out.println("------------------");
        System.out.println("Hi..."+yourName);
        System.out.println("You are" + yourAge + "years old");
        System.out.println("Your salary is" + yourSalary + "Bath");
    }
    
}
