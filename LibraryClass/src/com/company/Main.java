package com.company;

public class Main {

    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Hi");
        stringBuilder.append(5);
        stringBuilder.append('B');
        stringBuilder.delete(1,3);



        System.out.println(stringBuilder+" length :"+stringBuilder.length()+" "+stringBuilder.capacity());
	// write your code here
    }
}
