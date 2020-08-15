package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public Main() {
        //Create JFrame

        JFrame jFrame = new JFrame("Buton Layout");

//Specify Flow Layout for layout manager

        jFrame.setLayout(new FlowLayout());

//give Size of the Frame

        jFrame.setSize(220, 80);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Create button

        JButton upButton = new JButton("UP");

        JButton downButton = new JButton("Down");

        jFrame.add(upButton);

        jFrame.add(downButton);

//Show it

        jFrame.setVisible(true);
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
