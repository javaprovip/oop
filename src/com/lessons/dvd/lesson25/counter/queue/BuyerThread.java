package com.lessons.dvd.lesson25.counter.queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {
    private final Semaphore cashboxes;

    public BuyerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }


    @Override
    public void run() {
        try {
            cashboxes.acquire();
            Thread.sleep(5L);
            cashboxes.release();
//                synchronized (cashboxes){
//                        while (true) {
//                            if (!cashboxes.isEmpty()) {
//                            Cashbox cashbox = cashboxes.remove();
                           System.out.println(Thread.currentThread().getName() + "serving in some cashbox");
//                            cashboxes.wait(5L);
                            System.out.println(Thread.currentThread().getName() + "free in some cashbox");
//                            cashboxes.add(cashbox);
//                            cashboxes.notifyAll();
//                            break;
//                        } else {
                           System.out.println(Thread.currentThread().getName() + "wait free cashbox");
//                            cashboxes.wait();
//                    }
//                  }
//                }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}


