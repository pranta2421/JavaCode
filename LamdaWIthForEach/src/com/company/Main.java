package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


	// write your code here

        List<String> namelist=new ArrayList<>();
        namelist.add("Pranta");
        namelist.add("Tandra");
        namelist.add("Prodip");
        namelist.add("Aunidra");




        /**
         * Without lamda
         */

//        for (String names:namelist
//             ) {
//            System.out.println(names);
//        }
        /**
         * With lamda
         */
        namelist.forEach(
                (names)-> System.out.println(names)
        );
    }
}
