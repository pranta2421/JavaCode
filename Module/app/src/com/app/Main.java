package com.app;

import com.database.course;
import com.database.server;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        server ser=new server();
        List<course> co = ser.getCourseList();
      // for (course course:co){
        //System.out.println(course.getCoursename());}

        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI("https://www.google.com")).GET().build();
            try {
                HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandler.asString());
                System.out.println(httpResponse.body());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }
}
