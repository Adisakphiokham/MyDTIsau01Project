package com.thailand.dti;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WowWow {
    
 public static void main(String[] args) throws IOException {
        //สร้างตัวเเปร variable => ชนิดข้อมูล ตัวเเปร;
        String yourName;
        //เลขจำนวนเต็ม byte short int long
        int yourAge;
        //เลขจำนวนจริง float double
        double yourSalary;
        
        // input รับค่า โดยใช้ Scanner จะสร้างตัวเเทนของคลาส Scanner ขึ้นมา
        //เรียกว่า Objact หรือเรียกว่า Instance of Class
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        
        System.out.print("Enter yuor name");
        yourName = reader.readLine();
        System.out.print("Enter yuor age");
        yourAge = Integer.parseInt(reader.readLine());
        System.out.print("Enter yuor salary");
        yourSalary = Double.parseDouble(reader.readLine());
        System.out.println("------------------");
        System.out.println("Hi..."+yourName);
        System.out.println("You are" + yourAge + "years old");
        System.out.println("Your salary is" + yourSalary + "Bath");
  
 }
}