package com.lessons.dvd.lesson26.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<?> future = threadPool.submit(() -> {
            Thread.sleep(2000);
            System.out.println("Its callable");
            return 1;
        });

        System.out.println("Result:" + future.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");

    }
}
