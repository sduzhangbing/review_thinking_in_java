//package com.ban.start.concurrency;
//
//import com.google.common.collect.Lists;
//
//import java.util.List;
//import java.util.concurrent.*;
//
///**
// * Created by banzhang on 16-12-13.
// */
//public class TaskWithResult implements Callable<String> {
//    private int id;
//    public TaskWithResult(int id){
//        this.id = id;
//    }
//    @Override
//    public String call() throws Exception {
//        return "result of TaskWithResult " + id;
//    }
//
//    public static void main(String[] args) {
//        ExecutorService exec = Executors.newCachedThreadPool();
//        List<Future<String>> results = Lists.newArrayList();
//        for (int i = 0; i < 10; i++) {
//            results.add(exec.submit(new TaskWithResult(i)));
//        }
//        for (Future<String> fs : results){
//            try {
//                System.out.println(fs.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }finally {
//                exec.shutdown();
//            }
//        }
//    }
//}
