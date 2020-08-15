package com.company;

public class Main {

    public static void main(String[] args) {
        Person person=new Person();
	GenericClass<String> genericClass=new GenericClass<>("Pranta","new");
	GenericClass<Person> genericClass1=new GenericClass<>(person,person);
	person.setName("Susmita");
        System.out.println(genericClass.getName());
        System.out.println(genericClass1.getName().getName());
    }
}
