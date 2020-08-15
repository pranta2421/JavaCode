package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        method1();
        method2("Susmita",10);
        add(10,20);
        System.out.println(area(20,40));
        System.out.println(fullname("Pranta","Dam"));
        System.out.println(istrue(false,true));
    }

    public static void method1(){
        System.out.println("Pranta");
    }
    public static void method2(String name, int x){
        System.out.println(name +x);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static int area(int h, int w){
        return (h*w);
    }
    public static String fullname(String fname, String lname){
        return fname+" "+lname;
    }

    public static boolean istrue(boolean a,boolean b){
        if (a == b) {
            return a;
        }
        else {
            return b;
        }
    }
}
