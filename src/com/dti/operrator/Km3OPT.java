
package com.dti.operrator;


public class Km3OPT {
    public static void main(String[] args) {
        //Increment/Decrement Opt. => ++ เพิ่มทีละ1 -- ลดทีละ1
        int x = 10;
        int y;
        
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x--;
        System.out.println(x);
        --x;
        System.out.println(x);
        System.out.println("-------------------");
        y = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------------");
        y = x++;
        System.out.println(x);
        System.out.println(y);
        
        //Assignment Opt. => = += -= *= /= %=
        int num = 20;
        num += 50; //num = num + 50;
        num *= 2; //num = num * 2;
        num = num + 5 / 9 * x - y;
        num += 5 / 9 * x - y;
        
        System.out.println(num);
    }
    
}
