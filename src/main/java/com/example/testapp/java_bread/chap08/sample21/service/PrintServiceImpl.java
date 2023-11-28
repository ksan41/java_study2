package com.example.testapp.java_bread.chap08.sample21.service;

public class PrintServiceImpl {
    public static DataServiceImpl data = new DataServiceImpl();

    public void pringMessage() {
        System.out.printf("Hello! %s", data.getName());
    }
}
