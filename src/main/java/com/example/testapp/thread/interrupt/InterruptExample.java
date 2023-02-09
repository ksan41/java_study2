package com.example.testapp.thread.interrupt;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        thread.interrupt();
    }
}
