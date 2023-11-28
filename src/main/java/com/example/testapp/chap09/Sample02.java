package com.example.testapp.chap09;

public class Sample02 {
    public static void main(String[] args) {
        Car car = new ElectricCar("red", "Hyundai");
        car.printInfo();
        // car.setColor("Gray");
        // 부모 클래스를 자료형으로 생성했기 때문에 자식 클래스의 메소드 사용 불가
        car.printInfo();
    }
}
