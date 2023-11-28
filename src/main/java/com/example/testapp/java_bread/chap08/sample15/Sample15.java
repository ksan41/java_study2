package com.example.testapp.java_bread.chap08.sample15;

public class Sample15 {
    public static void main(String[] args) {
        // 정적 중첩 클래스
        // 외부 클래스인 Student가 일반 클래스이기 때문에 직접 인스턴스 생성 전 까진 생성되어 메모리에 올라가지 않음?
        Student.Score score = new Student.Score("빵형");
        score.eng = 23;
        score.mat = 21;

        score.showInfo();
    }
}
