package com.example.testapp.java_bread.chap08.test;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(concat("학교종이", "땡땡땡"));
        System.out.println(concat("객체지향", "패키지", "클래스", "객체", "접근제어자", "롬복"));
    }

    public static String concat(String... str) {
        String answer = "";
        for (String s : str) {
            answer += s;
        }
        return answer;
    }
}
