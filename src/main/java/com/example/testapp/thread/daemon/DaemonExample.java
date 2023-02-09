package com.example.testapp.thread.daemon;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread thread = new AutoSaveThread();
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("메인 스레드 종료");
    }
}
