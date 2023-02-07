package com.example.testapp.thread.state.waitNotify;

public class ThreadD extends Thread{

    private WorkObject workObject;

    public ThreadD(WorkObject workObject) {
        this.workObject = workObject;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodD();
        }
    }
}
