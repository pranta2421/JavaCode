package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
	// write your code here
        Hello hello=new Hello();
        hello.sayhello();
        //Method method=hello.getClass().getMethod("sayhello");
       myannotation m=hello.getClass().getAnnotation(myannotation.class);
        System.out.println(m.value());

    }
}
