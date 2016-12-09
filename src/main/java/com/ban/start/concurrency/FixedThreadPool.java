package com.ban.start.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by kaka on 16-12-9.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
