package Com.Company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends Main implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JLabel amount=new JLabel("Enter the amount");
        mainpanel.add(amount);

    }
}
