package com.example.testapp.thread.pool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
    private ExecutorService executorService;
    
    public CallbackExample() {
        this.executorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors()
        );
    }

    private CompletionHandler<Integer, Void> callback = 
        new CompletionHandler<Integer,Void>() {
            public void completed(Integer result, Void attachment) {
                System.out.println("completed() 실행 : " + result);
            }

            public void failed(Throwable exc, Void attachment) {
                System.out.println("failed() 실행 : " + exc.toString());
            }
        };
    
    public void doWork(final String x, final String y) {
        Runnable task = new Runnable() {
            public void run() {
                try {
                    int intX = Integer.parseInt(x);
                    int intY = Integer.parseInt(y);
                    int result = intX + intY;
                    callback.completed(result, null);
                } catch (Exception e) {
                    callback.failed(e, null);
                }
            }
        };
        executorService.submit(task);
    }

    public void finish() {
        executorService.shutdown();
    }

    public static void main(String[] args) {
        CallbackExample callbackExample = new CallbackExample();
        callbackExample.doWork("3", "3");
        callbackExample.doWork("3", "삼");
        callbackExample.finish();
    }
}
