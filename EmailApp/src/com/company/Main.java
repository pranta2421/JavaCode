package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
      //  System.out.println("Main begins");
        Methods methods=new Methods();
        methods.generateemail();
       // methods.Password(12);
        System.out.println("My Password: "+methods.Password(12));
        methods.setSetpassword("adsdjnssds");
        methods.setAlternatemail("js@gmail.com");
        methods.setMailboxcapacity(500);
        System.out.println("Set password:"+methods.getSetpassword()+"\n"+"Alternative mail:"+methods.getAlternatemail()+"\n"+"Mail Box Capacity:"+methods.getMailboxcapacity());
    }

}

