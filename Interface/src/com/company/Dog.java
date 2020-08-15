package com.company;

public class Dog extends Canine implements Pet {

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void friendly() {
        System.out.println("friendly");

    }
}
