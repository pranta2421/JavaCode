package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    JLabel jLabel;


    public Main() {
        JFrame jFrame=new JFrame("Button");
        //set layout
        jFrame.setLayout(new FlowLayout());
        //set size of the frame
        jFrame.setSize(200,100);
        //creating button
        JButton jButton=new JButton("UP");
        JButton jButton1=new JButton("Down");
        JButton jButton2=new JButton("Test");
        jLabel = new JLabel("Pranta Dam");

        //adding to the frame
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jLabel);
        //showing
        jFrame.setVisible(true);
        //closes on exit
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
	// write your code here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
