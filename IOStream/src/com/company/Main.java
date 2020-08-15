package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       // File file = new File("src/Sample.txt");
        try(FileInputStream fileInputStream=new FileInputStream("src/Sample.txt")) {
            System.out.println(fileInputStream.available());
            int content;
            while (( content=fileInputStream.read())!=-1){
                System.out.print((char) content);
            }

        }catch (Exception e){
            e.printStackTrace();

        }


        // write your code here
    /*    byte b[]=new byte[10];
        System.out.println("Enter the data");
        System.in.read(b);
        System.out.println("The entered numbers are: ");
        for (int i = 0; i <b.length ; i++) {
            System.out.println((char) b[i]);

        }

     */



    }
}
