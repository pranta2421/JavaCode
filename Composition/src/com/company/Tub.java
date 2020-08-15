package com.company;

public class Tub {
    private int size;
    private Bubble b;

    public Tub() {

        b=new Bubble();
        b.setColor("Red");
        b.setSize(25);
    }
    public String getbubblecolor(){
     return b.getColor();

    }
    public int getbubbleradius(){
        return b.getSize();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
