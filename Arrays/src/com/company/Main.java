package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = new int[2];
        String [] arraystr = new String[4];
        arraystr[0]="Pranta";
        arraystr[1]="Susmita";
        arraystr[2]="Prodip";
        arraystr[3]="Aunidra";
      // array[0]=1;
      // array[1]=2;


       for (int i = 0; i <arraystr.length ; i++) {



               System.out.println("Before"+arraystr[i]);


       }

        Arrays.sort(arraystr);
        for (int i = 0; i <arraystr.length ; i++) {



            System.out.println("After"+arraystr[i]);


        }






	// write your code here
     /*   int []intarray ={2,3,8,9};
        String []strarray={"Pranta","Susmita","Prodip","Aunidra"};
        Boolean []bools={true,false,true,false};
        for (int i = 0; i <intarray.length ; i++) {
            System.out.println(intarray[i]);

        }
        for (int i = 0; i <strarray.length ; i++) {
            System.out.println(strarray[i]);

        }
        for (int i = 0; i <bools.length ; i++) {
            System.out.println(bools[i]);

        }

      */

    }
}
