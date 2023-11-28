package com.example.testapp.java_bread.chap08.sample02;

public class VO {
    // 인스턴스 변수
    String name;
    int age;

    // 클래스 변수
    static final int ONE;
    static final int TWO;
    static final int THREE;

    // static block. static 변수 값을 초기화 하지 않고 뒤에서 초기화 할 수 있게 해줌
    static {
        System.out.println("static block 호출");
        ONE = 1;
        TWO = 2;
        THREE = 3;
    }

    public VO() {
        System.out.println("생성자 호출");
    }
}
