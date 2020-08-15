package com.company;

public class Main {
    private static String name;

    public static void main(String[] args) {
	// write your code here
        Sample.na sample=new Sample.na();
        int value=-45;
        int save=Math.abs(value);
        System.out.println(save);
        Main mymain = new Main();
        setName("Pranta");
        System.out.println(getName());
        sample.s("Susmita");
        System.out.println(sample.get());



    }
    public static void setName(String n){
        name=n;
    }
    public static String  getName(){
        System.out.println("shdghsn");
        return name;
    }
}
