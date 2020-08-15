package com.company;

public class Ball {
   private String color;
   private String name;
   private int bouncerate;

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getBouncerate() {
      return bouncerate;
   }

   public void setBouncerate(int bouncerate) {
      this.bouncerate = bouncerate;
   }



   public Ball() {
   }

   public Ball(String ncolor, String nname, int nbouncerate) {
      color = ncolor;
      name = nname;
      bouncerate = nbouncerate;
   }
   public Ball(String ncolor, String nname){
      color=ncolor;
      name=nname;

   }

   public void show(){
      System.out.println(color+" "+name+" "+bouncerate);
   }



   public void bounce(){
       System.out.println("bouncing");
   }


}
