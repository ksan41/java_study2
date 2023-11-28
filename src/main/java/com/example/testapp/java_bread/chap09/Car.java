package com.example.testapp.java_bread.chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
    protected String color;
    protected String manufactuter;

    public abstract String fillUp();

    public void printInfo() {
        System.out.println("이 차의 색 : " + this.color);
        System.out.println("이 차는 " + fillUp());
        System.out.println("이 차는 " + this.manufactuter + "에서 생산합니다.");
    }


    public String getColor() {
        return this.color;
    }

    public String getManufactuter() {
        return this.manufactuter;
    }
}
