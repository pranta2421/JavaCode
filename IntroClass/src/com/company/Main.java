package com.company;

public class Main {

    public static void main(String[] args) {
      Ball ball= new Ball();
      BasketBall basketBall=new BasketBall();
      basketBall.setName("Ball");
      Ball ball1=new Ball("Red","Pranta");
      ball.bounce();
      BeachBall beachBall = new BeachBall();
      beachBall.setColor("Red");
      beachBall.bounce();
      basketBall.isNBA=true;


      ball.setName("ok");
        System.out.println(ball.getName());
      ball.setName("2nd name");
        System.out.println(ball.getName());
        ball1.show();
        System.out.println(basketBall.getName());
        System.out.println(beachBall.getColor());
        basketBall.bounce();
        System.out.println(basketBall.isNBA());

        beachBall.behave();
        beachBall.setColor("White");
        beachBall.setSize(65);
        beachBall.setWeight("medium");

      System.out.println(beachBall.getWeight()+" "+beachBall.getSize());
      System.out.println(ball.getClass().getSimpleName());
      if (ball.equals(ball1)){
        System.out.println("Equal");
      }else{
        System.out.println("Not Equal");
      }

      System.out.println(ball.toString());





	// write your code here
     /*   // Ball b=new Ball();
        //Ball c= new Ball();
        Basketball bas =new Basketball();
        bas.b=true;

       // b.bouncerate=18;
        b.bounce();
        b.color="red";
        b.name="Football";
        b.bouncerate=15;


        System.out.println(ball.ncolor+" "+b.name+" "+b.bouncerate+" "+c.bouncerate);
        System.out.println(bas.istrue());

      */


    }
}
