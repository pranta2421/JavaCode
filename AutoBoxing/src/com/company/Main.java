package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Wrapping
        int b=23;
        Integer integer=new Integer(b);

        //unwrapping
        int recoverint = integer.intValue();



        //Autoboxing
        int i=32;
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(i);
        int myitem= arrayList.get(0);
        System.out.println(myitem);
        System.out.println(integer);
        System.out.println(recoverint);
    }
}
