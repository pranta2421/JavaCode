package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> arrayList =new ArrayList<>();

        arrayList.add("Pranta");
        arrayList.add("Tandra");
        arrayList.add("Prodip");
        arrayList.add("Aunidra");
        arrayList.add("Prodip");
       // arrayList.removeAll(arrayList);
        arrayList.remove("Pranta");
     /*   for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));


        }

      */if (arrayList.contains("Pranta")){
            System.out.println("OK");
        }
      //  if (arrayList.isEmpty()){
        //    System.out.println("Empty");
        //}
        else{

        for (String array:
             arrayList) {
            System.out.println("Name:" + array+array.indexOf("Prodip"));
        }
        }
    }
}
