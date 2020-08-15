package com.company;

public class Mythread implements Runnable {
    Thread thread;
    String mythread;
    @Override
    public void run() {
        System.out.println(mythread+" starting");
        for (int count = 0; count <10 ; count++) {
            try {
                Thread.sleep(400);
                System.out.println("In "+mythread+" count is "+count);
            } catch (InterruptedException e) {
                System.out.println(mythread+" interrupted");
                e.printStackTrace();
            }
            System.out.println(mythread+" terminated");

        }


    }

    public Mythread(String mythread) {
        this.mythread = mythread;
         thread = new Thread(this,mythread);
        thread.start();
    }
}
