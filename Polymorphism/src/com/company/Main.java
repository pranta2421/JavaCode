package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vet myvet =new Vet();
        Dog mydog =new Dog();
        Cat mycat =new Cat();

        //overloading
        mydog.makeSound();
        mydog.makeSound("bark");
        mydog.makeSound("bark","very loud");
        myvet.shot(mydog);
        myvet.shot(mycat);

    }
}
