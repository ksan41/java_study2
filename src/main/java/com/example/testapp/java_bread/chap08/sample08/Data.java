package com.example.testapp.java_bread.chap08.sample08;

public class Data {
    String name;
    int age;

    public Data() {
        this("무명", 0);
    }

    public Data(String name, int age) {
        System.out.println("Data 초기화");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Data {" +" name='" + name + "'" + ", age='" + age + "'" +
            "}";
    }
}
