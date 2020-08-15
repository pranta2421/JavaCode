package com.company;

public class First {
  synchronized   void display(String msg){
        System.out.println("["+msg);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
