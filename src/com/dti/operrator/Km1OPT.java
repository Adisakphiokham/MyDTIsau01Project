package com.dti.operrator;

public class Km1OPT {
    //operator ตัวดำเนินการ
    public static void main(String[] args) {
        System.out.println(1+7);
        System.out.println(10-7);
        System.out.println(10*7);
        System.out.println(10/7);
        System.out.println(10.0/7);
        System.out.println(10/7.0);
        System.out.println(10%7);
        //System.out.println("Mod" > "Mee");Error
        System.out.println(10>7);
        System.out.println(10<7);
        System.out.println(10==7);
        System.out.println(10!=7);
        System.out.println(10<=7);
        System.out.println(10>=7);
        //Logical !(not) &&(and) ||(or)
        System.out.println('A'>'c');
        System.out.println("---------------------------");
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("---------------------------");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
        System.out.println("---------------------------");
        System.out.println(false||false);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(true||true);
    }
    
}
