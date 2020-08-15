package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
        /**
         * trying to have it with user input
         */

//        Inputs inputs=new Inputs();
//        inputs.show();



//        int id=scanner.nextInt();
//        System.out.println("Enter name\n");
//        String name=scanner.next();
//        System.out.println("Enter grade\n");
//        int grade=scanner.nextInt();


	// write your code here
        /**
         * Creating student instance
         */
        Student pranta=new Student(1,"Pranta",12);
        Student tandra=new Student(2,"Tandra",12);
        Student aunidra=new Student(3,"Aunidra",6);

        /**
         * adding student
         */
        ArrayList<Student> studentArrayList=new ArrayList<>();
        studentArrayList.add(pranta);
        studentArrayList.add(tandra);
        studentArrayList.add(aunidra);
        /**
         * creating teacher instance
         */

        Teacher prodip=new Teacher(1,"Prodip",500);
        Teacher sushil=new Teacher(2,"Sushil",400);
        Teacher shanto=new Teacher(3,"Shanto",700);
        /**
         * adding teacher
         */
        ArrayList<Teacher> teacherArrayList=new ArrayList<>();
        teacherArrayList.add(prodip);
        teacherArrayList.add(sushil);
        teacherArrayList.add(shanto);

        /**
         * creating school instance
         */
        School school;
        school = new School(teacherArrayList,studentArrayList);
        pranta.updateFeespaid(1500);
        tandra.updateFeespaid(1500);
       System.out.println("School earned "+school.getTotalmoneyearned());

        prodip.getReceivesalary(prodip.getSalary());
        sushil.getReceivesalary(sushil.getSalary());
        shanto.getReceivesalary(shanto.getSalary());
        System.out.println("Total Money Spent "+school.getTotalmoneyspent());
        System.out.println("New Total Money Earned "+school.getTotalmoneyearned());


       // System.out.println(school.finalearning());
        System.out.println(pranta);





    }








}
