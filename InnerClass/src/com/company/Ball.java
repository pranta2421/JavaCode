package com.company;

public class Ball {
    private String ballname;
    private int ballsize;


    public void ballsetup(){
              new orangeballsetup().setuporangeball();

    }

    class orangeballsetup {
        public void setuporangeball(){
            ballname="Orange Ball";
            ballsize=56;
            System.out.println(ballname+" , "+ballsize);
        }

    }
}
