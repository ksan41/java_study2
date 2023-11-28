package com.example.testapp.java_bread.chap08.sample21;

import com.example.testapp.java_bread.chap08.sample21.service.PrintServiceImpl;

public class Sample21 {

    public static PrintServiceImpl print = new PrintServiceImpl();

    public static void main(String[] args) {
        print.pringMessage();
    }
}
