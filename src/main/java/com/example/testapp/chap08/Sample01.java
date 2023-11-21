package com.example.testapp.chap08;

public class Sample01 {
    
    String name = "멤버 변수";

    private int age;

    public void sayHello() {
        var friend = "친구야";
        System.out.printf("%s 안녕?\n", friend);
    }

    public void sayHello(String friend) {
        System.out.printf("%s 안녕?\n", friend);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sample01() {}
}
