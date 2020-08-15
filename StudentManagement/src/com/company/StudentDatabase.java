package com.company;

import java.util.Scanner;

public class StudentDatabase {
    private String firstname;
    private String lastname;
    private String gardeyear;
    private static int studentid=1000;
    private String coures="";
    private int coursecost=600;
    private int tutionfee=0;
    private int paidfees;
    private int balance;
    private static String id;



    public StudentDatabase() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your first name");
        this.firstname=in.next();
        System.out.println("Enter your last name");
        this.lastname=in.next();
        System.out.println("Enter grade year");
        this.gardeyear=in.next();
        generateid();
       // System.out.println("FIrstanme: "+firstname+"\n"+"Lastname: "+lastname+"\n"+"Grade year: "+gardeyear+"\n"+"ID: "+id);
        enroll();
        feepaid();
        System.out.println(toString());

    }

    void generateid(){
        studentid++;
        this.id=gardeyear+studentid;
        System.out.println("Generated Id: "+id);


    }
    void enroll(){

        do {
            System.out.println("Which course you want to take and q for exit");
            Scanner in=new Scanner(System.in);

            String cou=in.next();
            if (!cou.equals("q")){
                if (cou.equals("History101")||cou.equals("Mathematics101")||cou.equals("English101")
                ||cou.equals("Chemistry101")||cou.equals("ComputerScience101")) {
                    tutionfee = tutionfee + coursecost;
                    coures = coures + "\n" + cou;
                }else
                {
                    System.out.println("Course is wrong! Try again");
                }

            }else {
                break;
            }

        }while (1!=0);
        System.out.println("You are enrolled in: "+coures);
        System.out.println("The tution fee is "+tutionfee);

    }
    void feepaid(){
        System.out.println("How much you want to pay");
        Scanner in=new Scanner(System.in);
         paidfees=in.nextInt();
         balance=tutionfee-paidfees;
        System.out.println("Your balance is "+balance);

    }

    @Override
    public String toString() {
        return
                "First Name: " + firstname + '\n' +
                " Last Name: " + lastname + '\n' +
                " Grade Year= " + gardeyear + '\n' +

                " Courses Taken: " + coures + '\n' +

                " Fees to pay: " + tutionfee+'\n' +
                " Fees paid: " + paidfees+'\n' +
                " Balance: " + balance+'\n' +
                "Student Id='" + id + '\n' ;
    }
}
