package com.company;

public class Main {
    public enum Members{Pranta,Susmita,Aunidra,Prodip}
    public static Members selectedperson;
   // public static final int Pranta=2;
   // public static final int Susmita=2;
   // public static final int Aunidra=2;
   // public static final int Prodip=2;


    public static void main(String[] args) {
	// write your code here
        selectedperson=Members.Pranta;
        if (selectedperson.equals(Members.Pranta)) {
            System.out.println(selectedperson);

        }else{
            System.out.println("Null");
        }



      /*  int selectedperson = 2;
        if (selectedperson == Susmita) {
            System.out.println("SUSMITA");

        }

       */
    }
}
