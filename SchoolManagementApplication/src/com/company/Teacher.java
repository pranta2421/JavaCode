package com.company;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int receivesalary;


    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.receivesalary=0;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public void getReceivesalary(int salary){
        receivesalary+=salary;
//        System.out.println("Received salary "+receivesalary);
//        System.out.println("Salary "+salary);
        School.setTotalmoneyspent(receivesalary);
    }
}
