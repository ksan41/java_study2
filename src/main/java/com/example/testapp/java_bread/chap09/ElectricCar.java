package com.example.testapp.java_bread.chap09;

public class ElectricCar extends Car{
    
    public ElectricCar (String color, String manufacturer){
        super(color, manufacturer);
    }

    @Override
    public String fillUp() {
        return "전기를 충전합니다.";
    }

    public void setColor(String color) {
        this.color = color;
    }
}
