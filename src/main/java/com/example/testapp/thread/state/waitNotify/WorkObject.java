package com.example.testapp.thread.state.waitNotify;

public class WorkObject {
    public synchronized void methodC() {
        System.out.println("ThreadC의 methodC() 작업실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e ){}
    }

    public synchronized void methodD() {
        System.out.println("ThreadD의 methodD() 작업실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e){}
    }
}
