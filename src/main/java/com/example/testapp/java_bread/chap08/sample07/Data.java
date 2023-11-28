package com.example.testapp.java_bread.chap08.sample07;

public class Data {
    String name;
    int age;

    public Data() {
        System.out.println("Data 초기화");
        this.name = "빵형";
        this.age = 21;
    }


    @Override
    public String toString() {
        return "Data {" +" name='" + name + "'" + ", age='" + age + "'" +
            "}";
    }

}
