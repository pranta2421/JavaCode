package com.company;

public class BasketBall extends Ball {
    public boolean isNBA;
    public int capacity;

    public boolean isNBA(){
        if(isNBA==true){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void bounce() {
        System.out.println("Basketball bounce");
    }
}
