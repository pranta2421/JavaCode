package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
 JFrame frame;
    JPanel mainpanel;
    JLabel amount;
    public Main() {
        //frame
        frame=new JFrame("Banking App");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Jlabel
        JLabel choice=new JLabel("Click Your Choice");
        //jpanel
         mainpanel=new JPanel();
        //Button
        JButton deposit=new JButton("Deposit");
        JButton balancecheck=new JButton("Balance Check");
        JButton withdraw=new JButton("Withdraw");
        //action to the button
        deposit.addActionListener(new Deposit());
        balancecheck.addActionListener(new BalanceCheck());
        withdraw.addActionListener(new Withdraw());

        //adding to panel
        mainpanel.add(choice);
        mainpanel.add(deposit);
        mainpanel.add(balancecheck);
        mainpanel.add(withdraw);


        //adding to frame
        frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }


    private class Deposit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                amount=new JLabel("enter");
                mainpanel=new JPanel();
                mainpanel.add(amount);
                frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
                System.out.println("Clicked");

            }catch (Exception exception){
                exception.printStackTrace();
            }



        }
    }

    private class BalanceCheck implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class Withdraw implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
