package com.example.testapp.java_bread.chap08.sample15;

public class Student {
    static String name;

    public Student(String name) {
        this.name = name;
    }

    public static class Score {
        int eng;
        int mat;

        public Score(String name) {
            System.out.println("정적 내부 클래스 Score 생성");
            Student.name = name;
        }

        public void showInfo() {
            System.out.println("이름 : " + name);
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + mat);
        }
    }
}
