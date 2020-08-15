package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bathroom bath=new Bathroom(65);
        Tub bathtub=new Tub();
        System.out.println("Bathroom Area "+bath.getArea()+","+"Tub Size "+bath.gettubsize()+"bubble color "+bathtub.getbubblecolor()+" bubble radius "+bathtub.getbubbleradius());



    }
}
