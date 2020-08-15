package sample.model;

import java.sql.Timestamp;

public class Task {
    private Timestamp datecreated;
    private String description;
    private String task;
    private int userid;
    private int taskid;


    public Task() {
    }

    public Task(Timestamp datecreated, String description, String task,int userid,int taskid) {
        this.datecreated = datecreated;
        this.description = description;
        this.task = task;
        this.userid=userid;
        this.taskid=taskid;
    }

    public Timestamp getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Timestamp datecreated) {
        this.datecreated = datecreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getUserid() {
       // System.out.println(userid);
        return userid;

    }

    public void setUserid(int userid) {
        this.userid = userid;
        System.out.println("UserId:"+this.userid);
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }
}
