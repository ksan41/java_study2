package com.example.testapp.thread.group;

import java.util.Map;
import java.util.Set;

import com.example.testapp.thread.daemon.AutoSaveThread;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
        for (Thread thread : threads) {
            System.out.println("Name : " + thread.getName() +
                            (thread.isDaemon()? "(데몬)":"(주)"));
            System.out.println("\t소속그룹 : " + thread.getThreadGroup().getName());
            System.out.println();
        }
    }
}
