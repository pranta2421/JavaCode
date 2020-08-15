package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Main starting..");
        /**
         * creating instance of Mythread class
         */
        Mythread mt=new Mythread("child #1");
        Mythread mt2=new Mythread("child #2");
        Mythread mt3=new Mythread("child #3");
     //   Mythread mt4=new Mythread("child #4");


        /**
         * priority
         */

try {
    mt.thread.setPriority(Thread.MIN_PRIORITY);
    System.out.println("child #1 has priority "+mt.thread.getPriority());
    mt2.thread.setPriority(Thread.NORM_PRIORITY);
    System.out.println("child #2 has priority "+mt2.thread.getPriority());
    mt3.thread.setPriority(Thread.MAX_PRIORITY);
    System.out.println("child #3 has priority "+mt3.thread.getPriority());

}catch (Exception e){
    System.out.println("interrupted");
    e.printStackTrace();
}




        /**
         * join
         */

//        try {
//            mt.thread.join();
//            System.out.println("child #1 joined"+" priority "+mt.thread.getPriority());
//            mt2.thread.join();
//            System.out.println("child #2 joined");
//            mt3.thread.join();
//            System.out.println("child #3 joined");
//        } catch (InterruptedException e) {
//            System.out.println("interrupted");
//            e.printStackTrace();
//        }


        /**
         * isalive()
         */


//        do{
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//
//            } catch (InterruptedException e) {
//                System.out.println("Main interrupted");
//                e.printStackTrace();
//            }
//
//        }while (mt.thread.isAlive()||mt2.thread.isAlive()||mt3.thread.isAlive());


/**
 * normal
 */



//        for (int i = 0; i <50 ; i++) {
//            System.out.print(".");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println("main interrupted");
//                e.printStackTrace();
//            }
//
//        }
        System.out.println("Main ended ");

        /**
         * creating actual thread from previous object mt
         */
//        Thread thread=new Thread(mt);
//        thread.start();

    }
}
