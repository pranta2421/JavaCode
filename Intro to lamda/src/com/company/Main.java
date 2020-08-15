package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int width=10;
        /**
         * Without using lamba
         */
//        Drawable drawable=new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Draw "+width);
//
//            }
//        };
        /**
         * With using lamda
         * without parameter
         */

//        Drawable drawable=() -> System.out.println("Drawing "+width);
//        drawable.draw();
        /**
         * with parameter
         * no returning type
         */
        Drawable drawable=(int a,int b) -> System.out.println(a+b);
        drawable.draw(11,23);
        /**
         * with returning
         * without lamda
         */
//        Addable addable=new Addable() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
//        System.out.println(addable.add(12,85));

        /**
         * With returning type
         */
        Addable addable=(int a,int b)->(a+b);
    System.out.println(addable.add(12,23));


    Speakable speakable=(message) -> {
        String message1="Hello";
        String message2=message1+"World";
        return message+message2;

        };
        System.out.println(speakable.speak("Hi"));
    }



}
