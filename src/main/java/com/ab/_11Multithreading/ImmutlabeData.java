package com.ab._11Multithreading;

public class ImmutlabeData {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj = () -> {
            for (int i = 0; i <= 1000; i++) {
                c.inc();
            }
        };

        Runnable obj1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                c.inc();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + c.count);
    }
}

class Counter {
    int count;

    public synchronized void inc() {
        count++;
    }
}