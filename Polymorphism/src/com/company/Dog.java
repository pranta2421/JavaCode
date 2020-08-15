package com.company;

public class Dog extends Animal{
    private String name;
    public void move(){
        System.out.println("moving");
    }

    @Override
    public void makeSound() {
        System.out.println("barking");
    }

    @Override
    public void makeSound(String sound) {
        System.out.println(sound);
    }

    @Override
    public void makeSound(String sound, String loud) {
        System.out.println(sound+" "+loud);
    }
}
