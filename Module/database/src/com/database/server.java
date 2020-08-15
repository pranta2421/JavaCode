package com.database;

import java.util.ArrayList;
import java.util.List;

public class server {
    public List<course>getCourseList(){
        List<course> courseList = new ArrayList();
        course cor = new course();
        for (int i = 0; i <10 ; i++) {
            cor.setCoursename("Course " +i);
            cor.setAuthorname("Author "+i);
             courseList.add(cor);

        }
        return courseList;
    }



    
}
