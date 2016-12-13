package com.ban.start.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by banzhang on 16-12-13.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 6; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
