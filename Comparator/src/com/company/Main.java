package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"Samsung",200));
        list.add(new Product(2,"iPhone",700));
        list.add(new Product(3,"Nokia",400));
        list.add(new Product(4,"Huwai",100));

        /**
         * with using lamda
         */


        list.forEach((p) -> System.out.println("id: "+p.id+" Name: "+p.name+" Price: "+p.price));

/**
 * without using lamda
 */
//        for (Product p:
//             list) {
//            System.out.println("id: "+p.id+" Name: "+p.name+" Price: "+p.price);
//
//        }

        /**
         * filtering
         */

        System.out.println("===================================");
        Stream<Product> filtereddata=list.stream().filter(
                ((product) ->product.price>200 )
        );
        filtereddata.forEach((product) -> System.out.println("id: "+product.id+" name: "+product.name+" price: "+product.price) );




//        /**
//         * Comparator
//         */
//
//        System.out.println("=================================================");
//
//        Collections.sort(list, Comparator.comparing(p -> p.name));
//
//        /**
//         * Without lamda
//         */
//
////        for (Product p:
////             list) {
////            System.out.println("id: "+p.id+" Name: "+p.name+" Price: "+p.price);
////
////        }
//        /**
//         * With lamda
//         */
//
//        list.forEach((p) -> System.out.println("id: "+p.id+" Name: "+p.name+" Price: "+p.price));
    }
}
