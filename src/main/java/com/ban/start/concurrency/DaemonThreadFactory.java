package com.ban.start.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by banzhang on 16-12-15.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return  t;
    }
}
