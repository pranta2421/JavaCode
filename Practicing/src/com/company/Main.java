package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Implementation implementation=new Implementation();
       // implementation.method();
        implementation.setColor("Red");
        implementation.setNumber(2421);

        System.out.println(implementation.getColor()+" "+implementation.getNumber()+" "+implementation.method());
    }
}
