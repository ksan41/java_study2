package com.example.testapp.thread.state.waitNotify;

public class ProducerThread extends Thread{

    private DataBox dataBox;

    public ProducerThread(DataBox dataBox) {
        this.dataBox = dataBox;
    }
    public void run() {
        for (int i = 1; i <= 3 ; i++) {
            String data = "Data-" + i;
            dataBox.setData(data);
        }
    }
}
