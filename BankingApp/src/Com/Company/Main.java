package Com.Company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame frame;
    JPanel mainpanel;
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


}
