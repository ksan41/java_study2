package com.example.testapp.java_bread.chap08.sample12;

public class Sample12 {
    
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 내부 클래스 실행");
            }
        };
        r.run();
    }
}
