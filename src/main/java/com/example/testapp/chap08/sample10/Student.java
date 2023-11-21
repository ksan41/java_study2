package com.example.testapp.chap08.sample10;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    // 인스턴스 내부 클래스
    // 생성해야 사용 가능
    // 외부클래스.내부클래스 형태로 new 연산자로 생성
    public class Score {
        int eng;
        int mat;

        public void showInfo() {
            System.out.println("이름 : " + name);
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + mat);
        }
    }
}
