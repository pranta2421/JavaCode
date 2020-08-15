package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Main {
    private JFrame frame;

    private JTextArea quesarea;
    private JTextArea ansarea;

    private ArrayList<Flash> flashArrayList;

    public Main() {
        frame=new JFrame("Flash Card");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font greatfont= new Font("Helvetica ",Font.BOLD,21);

        //instantiate array

        flashArrayList=new ArrayList<Flash>();

        //label
        JLabel question;
        question = new JLabel("Question");
        JLabel answer;
        answer = new JLabel("Answer");

        //button
        JButton next;
        next = new JButton("Next Card");
        //text area question
        quesarea=new JTextArea(6,20);
        quesarea.setLineWrap(true);
        quesarea.setWrapStyleWord(true);
        quesarea.setFont(greatfont);
        //text area answer
        ansarea=new JTextArea(6,20);
        ansarea.setLineWrap(true);
        ansarea.setWrapStyleWord(true);
        ansarea.setFont(greatfont);

        //scroll question
        JScrollPane qPane=new JScrollPane(quesarea);
        qPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        qPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        //scroll answer
        JScrollPane pane=new JScrollPane(ansarea);
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       JPanel mainpanel=new JPanel();


        //adding to mainpanel
        mainpanel.add(question);
        mainpanel.add(qPane);
        mainpanel.add(answer);
        mainpanel.add(pane);
        mainpanel.add(next);
        next.addActionListener(new NextCardListener());
        //menubar
         JMenuBar menuBar=new JMenuBar();
         JMenu menu=new JMenu("File");
         JMenuItem newitem=new JMenuItem("New");
         JMenuItem saveitem=new JMenuItem("Save");


         newitem.addActionListener(new newactionlistener());
         saveitem.addActionListener(new saveactionlistener());
         //menubar adding

        menu.add(newitem);
        menu.add(saveitem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        //adding to frame

        frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
        frame.setSize(500,600);
        frame.setVisible(true);

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

    class NextCardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Clicked");
            Flash flash=new Flash(quesarea.getText(),ansarea.getText());
            flashArrayList.add(flash);

            System.out.println("Size: "+flashArrayList.size());
            clear();


        }

        private void clear() {
            quesarea.setText("");
            ansarea.setText("");
            quesarea.requestFocus();
        }
    }
    class newactionlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          //  System.out.println("New clicked");
            quesarea.setText("");
            ansarea.setText("");
            quesarea.requestFocus();
        }
    }
    class saveactionlistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Save Clicked");
            Flash flash=new Flash(quesarea.getText(),ansarea.getText());
            flashArrayList.add(flash);

            JFileChooser chooser=new JFileChooser();
            chooser.showSaveDialog(frame);
            save(chooser.getSelectedFile());
        }
    }

    private void save(File selectedFile) {
        try {
            BufferedWriter  writer=new BufferedWriter(new FileWriter(selectedFile));
            for (Flash flash:flashArrayList){
                writer.write(flash.getQuestion()+"/");
                writer.write(flash.getAnswer()+"\n");
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
