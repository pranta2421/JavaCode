package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputs {
    ArrayList<Student> studentArrayList=new ArrayList<>();
    ArrayList<Teacher> teacherArrayList=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    Student student1;
    Teacher teacher;
    void student() {
        System.out.println("Enter id\n");

        int id=scanner.nextInt();
        System.out.println("Enter name\n");
        String name=scanner.next();
        System.out.println("Enter grade\n");
        int grade=scanner.nextInt();
        student1=new Student(id,name,grade);


        studentArrayList.add(student1);
        schoolstudent();


    }

     void schoolstudent() {
      School school=new School(teacherArrayList,studentArrayList);
         System.out.println("Enter fess paid\n");
         int fesspaid=scanner.nextInt();
         student1.updateFeespaid(fesspaid);
         System.out.println("School earned "+school.getTotalmoneyearned());

    }

    void teacher() {
        System.out.println("Enter id\n");

        int id=scanner.nextInt();
        System.out.println("Enter name\n");
        String name=scanner.next();
        System.out.println("Enter salary\n");
        int salary=scanner.nextInt();
         teacher=new Teacher(id,name,salary);

        teacherArrayList.add(teacher);
        schoolteacher();




    }

        void schoolteacher() {
        School school=new School(teacherArrayList,studentArrayList);
        teacher.getReceivesalary(teacher.getSalary());

            System.out.println(school.getTotalmoneyspent());
        System.out.println("School earned "+school.getTotalmoneyearned());

    }

    void show(){

        System.out.println("1.Student\n2.Teacher");
        scanner=new Scanner(System.in);
        int number;
        do {


            System.out.println("Enter the option\n");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    student();
                    break;

                case 2:
                    teacher();
                    break;
            }
        }while (number!=3);

    }
}
