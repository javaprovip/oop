package com.lessons.dvd.lesson26.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RocketDetailRunnable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CyclicBarrier cyclicBarrier;

    public RocketDetailRunnable(RocketDetail rocketDetail, CyclicBarrier cyclicBarrier) {
        this.rocketDetail = rocketDetail;
        this.cyclicBarrier = cyclicBarrier;

    }

    @Override
    public void run() {
        System.out.println("Preparing detail" + rocketDetail);
        try {
            Thread.sleep(1000);
            System.out.println("Detail is ready and awaiting" + rocketDetail);
            cyclicBarrier.await();
            System.out.println("Detail is used");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }

    }
}
