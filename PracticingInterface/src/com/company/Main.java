package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Prodip prodip=new Prodip();
        Aunidra aunidra=new Aunidra();
        Tandra tandra=new Tandra();
        prodip.Education();
        prodip.setMoney(10000);
        prodip.setWillingless("Willing");
        aunidra.cadetcoaching();
        aunidra.Germany();
        aunidra.India();
        aunidra.Education();
        aunidra.setMoney(100000);
        aunidra.setWillingless("Wants");
        tandra.cadetcoaching();
        tandra.Germany();
        tandra.India();
        System.out.println("Prodip: "+prodip.getMoney()+" "+prodip.getWillingless());
        System.out.println("Aunidra: "+aunidra.getMoney()+" "+aunidra.getWillingless());
    }
}
