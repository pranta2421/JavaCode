package com.company;

import javafx.fxml.LoadListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class FlashCradPlayer {
    private JFrame frame;
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<Flash> flashArrayList;
    private Iterator iterator;
    private int index;
    private boolean isShow;
    private Flash currentcard;
    private JButton next;


    public FlashCradPlayer() {
        frame=new JFrame("Flash Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font mFont=new Font("Helvetica",Font.BOLD,23);

        display=new JTextArea(10,20);
        display.setFont(mFont);

        JScrollPane pane=new JScrollPane(display);
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        next=new JButton("Show Answer");
        next.addActionListener(new NextListener());

        JMenuBar menuBar=new JMenuBar();
        JMenu menu=new JMenu("File");
        JMenuItem item=new JMenuItem("Load Data");
        item.addActionListener(new LoadActionListener());

        menu.add(item);
        menuBar.add(menu);

        JPanel panel=new JPanel();

        panel.add(pane);
        panel.add(next);

        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setSize(640,500);
        frame.setVisible(true);





    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlashCradPlayer();
            }
        });

    }
    class NextListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isShow){
                display.setText(currentcard.getAnswer());
                next.setText("Next Card");
                isShow=false;
            }else{
                if (iterator.hasNext()){
                    shownextcard();
                }else{
                    display.setText("No more cards");
                    next.setEnabled(false);
                }
            }

        }
    }

    class LoadActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.showOpenDialog(frame);
            loadfile(fileChooser.getSelectedFile());
        }
    }

    private void loadfile(File selectedFile) {

        flashArrayList= new ArrayList<Flash>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(selectedFile));
            String line=null;
            while((line=reader.readLine())!=null){
                makecard(line);

            }

        }catch (Exception e){
            System.out.println("Couldn't find the file");
            e.printStackTrace();


        }

        iterator=flashArrayList.iterator();
        shownextcard();



    }

    private void shownextcard() {

        currentcard=(Flash) iterator.next();
        display.setText(currentcard.getQuestion());
        next.setText("Show Answer");

        isShow=true;
    }

    private void makecard(String lineToparse) {
//        String[] result;
//        result=lineToparse.split("/");
//        Flash flash=new Flash(result[0],result[1]);
//        flashArrayList.add(flash);
//        System.out.println("Made a card");
        StringTokenizer tokenizer=new StringTokenizer(lineToparse,"/");
        if (tokenizer.hasMoreTokens()){
            Flash flash=new Flash(tokenizer.nextToken(),tokenizer.nextToken());
            flashArrayList.add(flash);
            System.out.println("Card added");
        }
    }
}
