package com.example.testapp.thread.state.waitNotify;

public class WaitNotifyExample {
    public static void main(String[] args) {
//        WorkObject workObject = new WorkObject();
//
//        ThreadC threadC = new ThreadC(workObject);
//        ThreadD threadD = new ThreadD(workObject);
//
//        threadC.start();
//        threadD.start();
        DataBox dataBox = new DataBox();

        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);

        producerThread.start();
        consumerThread.start();
    }
}
