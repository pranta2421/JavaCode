package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        String s;
        String string;



       // byte b[] = new byte[500];
       // byte n[] = new byte[20];

        System.out.println("Enter the file name");
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        //System.in.read(n);
       // String filename = new String();

        File file = new File(s);


        try (FileWriter fileWriter = new FileWriter(file)) {

            System.out.println("Write something for file");
            Scanner scanner1=new Scanner(System.in);
            string=scanner1.nextLine();
            fileWriter.write(string);


//            System.in.read(b);
//            for (int i = 0; i < b.length; i++) {
//                //System.out.println((char)b[i]);
//                fileWriter.write( b[i]);
//            }


//                FileReader fileReader=new FileReader(file);
//                BufferedReader bufferedReader=new BufferedReader(fileReader);
//            //System.out.println("scds");
//                String line = null;
//                while ((line=bufferedReader.readLine())!=null){
//                    System.out.println(line);
//
//
//
//            }


        } catch (Exception e) {
            e.printStackTrace();

        }

       try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int content;

            while ((content = fileInputStream.read()) !=-1) {
                System.out.print( (char) content);
            }
        }



    }
}
