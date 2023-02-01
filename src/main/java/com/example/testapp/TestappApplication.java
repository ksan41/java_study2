package com.example.testapp;


import com.example.testapp.thread.BeepTask;

import java.awt.*;

public class TestappApplication {

    public static void main(String[] args)
    {
//        SpringApplication.run(TestappApplication.class, args);
//        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
            }

        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}

        }
    }

}
