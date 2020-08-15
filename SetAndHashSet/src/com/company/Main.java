package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[]={3,6,6,10,65};

        Set<Integer> set=new HashSet<>();
        try {
            for (int i = 0; i <array.length ; i++) {
                set.add(array[i]);

            }

            Set set1=new HashSet();
            set1.add("Bangladesh");
            set1.add("India");
            set1.add("Germany");

            TreeSet set2=new TreeSet(set1);
            System.out.println(set2);

            LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
            linkedHashSet.add("Pranta");
            linkedHashSet.add("Susmita");
            linkedHashSet.add("Aunidra");
            linkedHashSet.add("Prodip");

            Iterator<String> iterator=linkedHashSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }


            set.remove(65);

            set.add(65);
            TreeSet treeSet=new TreeSet(set);
            System.out.println(set);
            System.out.println(treeSet);


            if(set.contains(65)){
                System.out.println("Is there");
            }else {
                System.out.println("Not There");
            }

        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
