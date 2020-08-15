package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JLabel reverseText;
    JLabel enter;
    JLabel palindrome;
    JLabel initial;
    JTextField textField;
    JButton reverse;


    public Main() {

        JFrame jFrame=new JFrame("Enter Text");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
        initial= new JLabel("Enter Text");
        textField=new JTextField(10);
        reverse=new JButton("Reverse");
        reverseText=new JLabel("ReverseText");
        palindrome=new JLabel();
        enter=new JLabel();
        textField.setActionCommand("textfield");
        textField.addActionListener(this);
        reverse.addActionListener(this);

        jFrame.add(initial);
        jFrame.add(textField);
        jFrame.add(reverse);
        jFrame.add(reverseText);
        jFrame.add(palindrome);
        jFrame.add(enter);



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

    @Override
    public void actionPerformed(ActionEvent e) {
        String Original=textField.getText();
        String Holder="";
        if (e.getActionCommand().equals("Reverse")){

            for (int i = Original.length()-1; i >=0 ; i--) {

                Holder+=Original.charAt(i);
                reverseText.setText(Holder);
                


            }


        }else
        {
          enter.setText("You Hit enter...The text is: "+textField.getText());
        }
//        if (Original.equals(Holder)){
//            palindrome.setText("They are identical");
//        }else {
//            palindrome.setText("Not Identical");
//        }




    }
}
