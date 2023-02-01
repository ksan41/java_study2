package com.example.testapp.thread;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("메인 스레드 명: " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println("스레드명: " + threadA.getName());
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("스레드명: " + threadB.getName());
        threadB.start();



    }
}
