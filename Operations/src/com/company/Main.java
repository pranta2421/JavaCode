package com.company;

public class Main {

    public static void main(String[] args) {
	//addition
        double x1=3;
        double y1=6;
        if (x1<y1){
        System.out.println("addition "+(x1+y1));
        System.out.println("Substraction " +(x1-y1));
        System.out.println("multiplication "+(x1*y1));
        System.out.println("Division " + (x1/y1));
        System.out.println("Remainder "+x1%y1);
    }
        else {
            System.out.println("Condition not satisfied");
        }

    }
}
