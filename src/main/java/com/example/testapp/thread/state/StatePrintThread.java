package com.example.testapp.thread.state;

public class StatePrintThread extends Thread{
    private Thread targetThread;

    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    public void run() {
        while(true) {
            State state = targetThread.getState();
            System.out.println("타겟 스레드 상태 : " + state);

            if (state == State.NEW) {
                targetThread.start();
            }

            if (state == State.TERMINATED) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
