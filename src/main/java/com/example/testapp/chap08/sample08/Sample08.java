package com.example.testapp.chap08.sample08;


public class Sample08 {
    
    public static void main(String[] args) {
        Data data = new Data("빵형", 22);
        System.out.println(data.toString());

        Data data2 = new Data();
        System.out.println(data2.toString());
    }
}
