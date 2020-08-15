package com.company;

public class Animal {
    private String name;
    public void makeSound(){
        System.out.println("grr");
    }
    public void makeSound(String sound){
        System.out.println(sound);

    }

    public void makeSound(String sound,String loud){
        System.out.println(sound+" "+loud);

    }
}
