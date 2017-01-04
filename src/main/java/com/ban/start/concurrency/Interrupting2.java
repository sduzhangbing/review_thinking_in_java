package com.ban.start.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by kaka on 16-12-27.
 */
class BlockedMutex{
    private Lock lock = new ReentrantLock();

    public BlockedMutex() {
        lock.lock();
    }

    public void f(){
        try {
            lock.lockInterruptibly();
            System.out.println("lock acquired in f()");
        } catch (InterruptedException e) {
            System.out.println("Interrupted from lock acquisition in f()");
            e.printStackTrace();
        }
    }
}

class Blocked2 implements Runnable{
    BlockedMutex blockedMutex = new BlockedMutex();

    @Override
    public void run() {
        System.out.println("Waiting for f() in BlocledMutex");
//        BlockedMutex blockedMutex = new BlockedMutex();
        blockedMutex.f();
        System.out.println("Broken out of blocked call");
    }
}

public class Interrupting2 {
    public static void main(String[] args) {
        BlockedMutex blockedMutex = new BlockedMutex();
        blockedMutex.f();

        Blocked2 blocked2 = new Blocked2();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(blocked2);
//        Thread t = new Thread(new Blocked2());
//        t.start();
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("Issuing t.interrupt()");
        executorService.shutdown();
//        t.interrupt();
    }
}
