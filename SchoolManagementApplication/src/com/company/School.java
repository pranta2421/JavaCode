package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static int totalmoneyearned;
    private static int totalmoneyspent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalmoneyearned=0;
        this.totalmoneyspent=0;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    public static void updateTotalmoneyearned(int moneyearned) {
        totalmoneyearned += moneyearned;

    }

    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    public static void setTotalmoneyspent(int moneyspent) {
        totalmoneyspent+=moneyspent;
       // System.out.println("Total Money Spent: "+totalmoneyspent);
       totalmoneyearned -= moneyspent;
    }
//    public int finalearning(){
//        int result= totalmoneyearned-totalmoneyspent;
//        return result;
//    }
}
