package com.company;

public class Main {

    public static void main(String[] args) {
        int num[]={ 4,3,2,7,9 };
        int deno[]={ 2,0,3 };

        for (int i = 0; i <num.length ; i++) {
            try {

                System.out.println(num[i]/deno[i]);


            }catch (ArithmeticException e){
                System.out.println("can't divide by zero");
          }
        catch (ArrayIndexOutOfBoundsException e){
                System.out.println("no matching number");
            }finally {
                System.out.println("Running!");
            }

        }




	// write your code here
     /*   float sum=0;

        for(String argument : args){
            try {
                sum=sum+Float.parseFloat(argument);

            }catch (Exception e){
                System.out.println(argument +" is not a number");
                System.out.println(e.getMessage());
            }


        }
        System.out.println(sum);

      */

    }


}
