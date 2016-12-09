package com.ban.start.concurrency;

/**
 * Created by kaka on 16-12-9.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff!");
    }
}
