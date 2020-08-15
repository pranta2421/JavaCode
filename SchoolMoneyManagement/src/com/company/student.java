package com.company;

public class student {
    private int id;
    private String name;
    private String grade;
    private int fee;
    private int totalfee=0;

    public int getFee() {
        return totalfee+=fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public student(int id, String name, String grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;
    }


}
