package com.company;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Methods {
    String firstname;
    String lastname;
    Scanner scanner=new Scanner(System.in);
    String department;
    String company=".company.com";
    private String setpassword;

    public String getSetpassword() {
        return setpassword;
    }

    public void setSetpassword(String setpassword) {
        this.setpassword = setpassword;
    }

    public int getMailboxcapacity() {
        return mailboxcapacity;
    }

    public void setMailboxcapacity(int mailboxcapacity) {
        this.mailboxcapacity = mailboxcapacity;
    }

    public String getAlternatemail() {
        return alternatemail;
    }

    public void setAlternatemail(String alternatemail) {
        this.alternatemail = alternatemail;
    }

    private int mailboxcapacity;
    private String alternatemail;

    public void generateemail(){
        System.out.println("Enter your firstname");
        firstname=scanner.next();
        System.out.println("Enter your last name");
        lastname=scanner.next();
        DepartmentName(department);

        System.out.println("Your mail id is: "+firstname.toLowerCase()+lastname.toLowerCase()+"@"+department+company);
    }

    private void DepartmentName(String departmentname) {
        System.out.println("1.Sales\n2.Development\n3.Accounting\n4.None");
        System.out.println("Enter your department");
        int choice=scanner.nextInt();
        if(choice==1){
            departmentname="Sales";
            department=departmentname;
        }else if (choice==2){
            departmentname="Development";
            department=departmentname;
        }else if (choice==3){
            departmentname="Accounting";
            department=departmentname;
        }else{
            departmentname="";
            department=departmentname;
        }

    }
    public String Password(int count){
        String variable="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%!^&*";
        StringBuilder password=new StringBuilder();
        while (count--!=0){
            int character=(int)(Math.random()*variable.length());
            password.append(variable.charAt(character));
        }
        return password.toString();
       // System.out.println("Password:"+password.toString());



//        byte array[]=new byte[10];
//        new Random().nextBytes(;
//        String password=new String(array, Charset.defaultCharset());
//        System.out.println("Password:"+password);
    }


}
