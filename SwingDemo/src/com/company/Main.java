package com.company;

import javax.swing.*;

public class Main {

    public Main() {
        //create
        JFrame jFrame=new JFrame("1st app");
        //set size
        jFrame.setSize(300,200);

        JLabel jLabel=new JLabel("Pranta Dam");
        jFrame.add(jLabel);

        //display
        jFrame.setVisible(true);

        //close
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
