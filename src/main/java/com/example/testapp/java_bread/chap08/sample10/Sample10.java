package com.example.testapp.java_bread.chap08.sample10;

public class Sample10 {
    
    public static void main(String[] args) {
        Student student = new Student("빵형");
        // 내부 인스턴스 클래스 생성
        Student.Score studentScore = student.new Score();
        studentScore.eng = 23;
        studentScore.mat = 21;

        studentScore.showInfo();
    }
}
