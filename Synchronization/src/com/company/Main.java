package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        First first=new First();
        Second second=new Second(first,"welcome");
        Second second1=new Second(first,"new");
        Second second2=new Second(first,"programmar");
    }
}
