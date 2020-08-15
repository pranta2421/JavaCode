package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog mydog=new Dog();
        mydog.setName("Shephard");
        System.out.println(mydog.getName());
        mydog.friendly();
        mydog.play();
    }
}
