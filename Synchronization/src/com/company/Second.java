package com.company;

public class Second implements Runnable{
    First fobj;
    String msg;

    public Second(First obj, String sg) {
        fobj = obj;
        msg = sg;
        Thread thread=new Thread(this::run);
        thread.start();
    }

    @Override
    public void run() {
        fobj.display(msg);

    }
}
