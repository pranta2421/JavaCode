package com.company;

public class Bathroom {
    private int area;
    private Tub t;

    public Bathroom(int area) {
        this.area = area;
        t=new Tub();
        t.setSize(23);

    }
    public int gettubsize(){
        return t.getSize();
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
