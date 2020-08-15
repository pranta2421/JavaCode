package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Methods {
    double currentamount = 0;
    double depositamount;
    double withdrawamount;
    Scanner scanner = new Scanner(System.in);

    public void Deposit() {
        System.out.println("Enter the amount to deposit");
        depositamount = scanner.nextDouble();

        System.out.println("You have deposited " + depositamount);
        currentamount = currentamount + depositamount;
        System.out.println("Your current balance is " + currentamount);


    }

    public void Withdraw() {
        System.out.println("Enter the Withdraw amount");
        withdrawamount = scanner.nextDouble();
        System.out.println("You have withdrawn " + withdrawamount);
        currentamount = currentamount - withdrawamount;
        System.out.println("Your current balance is " + currentamount);
    }

    public void Current() {
        System.out.println("Your current balance is " + currentamount);
    }

    public void Show() {
        System.out.println("Welcome to the Bank!");
        System.out.println("Enter customer name:");
        // Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter customer id: ");
        String id = scanner.next();
        System.out.println(" 1.Deposit\n 2.Withdraw\n 3.Current Balance\n 4.EXIT");
        int input;
        do {


            System.out.println("Enter the option");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    Deposit();
                    break;
                case 2:
                    Withdraw();
                    break;
                case 3:
                    Current();
                    break;



            }
        } while (input != 4);
    }
}
