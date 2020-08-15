package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(25,"Pranta");
        hashMap.put(24,"Susmita");
        hashMap.put(56,"Prodip");
        hashMap.put(18,"Aunidra");

        /*for (int i = 0; i <hashMap.size() ; i++) {
            System.out.println(hashMap.values());

        }

         */



      // System.out.println(hashMap.entrySet());


        Iterator iterator=  hashMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry pair = (Map.Entry)iterator.next();


              System.out.println(pair.getKey() +" "+ pair.getValue());

        }

    }
}
