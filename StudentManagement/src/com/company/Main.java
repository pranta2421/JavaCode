package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many students to add");
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        StudentDatabase[] studentDatabase = new StudentDatabase[count];



        for (int i = 0; i <count ; i++) {
            studentDatabase[i]=new StudentDatabase();




        }








	// write your code here
    }
}
