package com.company;

/**
 * This class is for the student management
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;

    /**
     * Initialize feespaid=0;
     * total fess is 30000
     * @param id
     * @param name
     * @param grade
     */

    public Student(int id, String name, int grade) {
        this.feespaid=0;
        this.feestotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * alter the grade as gets promoted
     * @param grade
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees
     * @param fees
     */
    public void updateFeespaid(int fees) {
        feespaid+=fees;

//        System.out.println(feespaid);
//        System.out.println(fees);
        School.updateTotalmoneyearned(feespaid);

    }

    /**
     *
     * @return student id
     */

    public int getId() {
        return id;
    }

    /**
     * return student name
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * return student grade
     * @return
     */

    public int getGrade() {
        return grade;
    }

    /**
     * return feespaid
     * @return
     */

    public int getFeespaid() {
        return feespaid;
    }

    /**
     * return total fees
     * @return
     */

    public int getFeestotal() {
        return feestotal;
    }
    public int remainingfees(){
        return feestotal-feespaid;
    }

    @Override
    public String toString() {
        return "name "+name+" grade "+grade+" id "+id;
    }
}
