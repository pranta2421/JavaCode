package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JLabel jLabel;
//implementing interface
    public Main()  {
        //Creating Frame
        JFrame jFrame=new JFrame("Swing Practice");
        //Setting layout
        jFrame.setLayout(new FlowLayout());
        //Setting size of the frame
        jFrame.setSize(300,200);
        //Showing the frame
        jFrame.setVisible(true);
        //exit on close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creating buttons
        JButton up= new JButton("Up");
        JButton down=new JButton("Down");
        //adding to frame
        jFrame.add(up);
        jFrame.add(down);
        //Funtioning button with interface
        up.addActionListener(this);
        down.addActionListener(this);
//        //functioning buttons without implementing interface
//        up.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Up is clicked");
//            }
//        });
//        down.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Down is clicked");
//            }
//        });
        //Creating label
         jLabel=new JLabel("Press the button");
        //adding to frame
        jFrame.add(jLabel);

    }

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new Main();
        }
    });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getActionCommand().equals("Up")){
          System.out.println("Up clicked");
          jLabel.setText("Up pressed");

      }else {
          System.out.println("Down Clicked");
          jLabel.setText("Down Pressed");
      }
    }
}
