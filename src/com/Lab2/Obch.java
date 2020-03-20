package com.Lab2;

public class Obch {
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = .1234;

    public void Result(){
        double result=(f*b) + (i/c) - (d*s);
        System.out.println("Result: " +result);
    }
    public void Privedennya(){
        double k=f*0.3;
        int kp= (int)(f*0.3);
    System.out.println("k= "+k);
        System.out.println("kp= "+kp);
    }
    public void Inkr(){
        int a,b=5;
        int t=7; int w=9;
        double r=b++ + t++ + ++w;
        System.out.println(("Result:"+r+", b="+b+", t="+t+" ,w="+w));
    }
     public void Mathh(){
        double x=4;
        double y=Math.sqrt(x);
        double z=Math.log(x);
        System.out.println("Sqrt 4= "+y);
        System.out.println("Log 4= "+z);

     }
}
