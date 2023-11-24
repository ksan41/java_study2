package com.example.testapp.chap08.sample21.service;

public class PrintServiceImpl {
    public static DataServiceImpl data = new DataServiceImpl();

    public void pringMessage() {
        System.out.printf("Hello! %s", data.getName());
    }
}
