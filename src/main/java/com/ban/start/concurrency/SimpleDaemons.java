package com.ban.start.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by banzhang on 16-12-15.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        try {
            while (true){
                TimeUnit.MILLISECONDS.sleep(10);
                System.out.println(Thread.currentThread() + " " + this);
            }
        }catch (InterruptedException e){
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        TimeUnit.MILLISECONDS.sleep(80);
    }
}
