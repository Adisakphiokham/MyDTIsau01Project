package com.dti.operrator;

import java.util.Scanner;

public class Km2OPT {
    public static void main(String[] args) {
        //Ternary Opt.____?____:____
        //เงื่อนไขที่ต้องพิสูจน์ ? ทำเมื่อเป็นจริง : ทำเมื่อเป็นเท็จ
        
        int score;
        Scanner sc = new Scanner(System.in);
        String result;
        
        System.out.println("---------------------------------------");
        System.out.println(" Program Check Result Score");
        System.out.println("---------------------------------------");
        System.out.println("Inport your score");
        score = sc.nextInt();
        System.out.println("---------------------------------------");
        result = score >= 50 ? "Pass... *U*" : "NOT Pass... T_T";
        System.out.println("Result is" + result);
        
    }
    
}
