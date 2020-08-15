package com.company;

public class Main {

    public static void main(String[] args) {
	ProcessHandle cuProcessHandle = ProcessHandle.current();
	ProcessHandle.Info cuInfo = cuProcessHandle.info();
        System.out.println("PID " + cuProcessHandle.pid());
        System.out.println("Info "+cuInfo);
    }
}
