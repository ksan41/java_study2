package com.example.testapp.chap08;

public class Sample11 {
    
    void localMethod() {
        int age = 23;

        // 지역 클래스
        // 클래스 내의 메서드 내에 존재하는 클래스
        // 해당 메서드 내에서만 생성 및 사용 가능
        class LocalClass {
            public void howOldAreYou() {
                System.out.printf("빵형은 %d살", age);
            }
        }

        LocalClass innerClass = new LocalClass();
        innerClass.howOldAreYou();
    }

    public static void main(String[] args) {
        Sample11 outer = new Sample11();
        outer.localMethod();
    }
}
