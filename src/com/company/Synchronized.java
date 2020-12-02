package com.company;

public class Synchronized {
    public static void main (String [] args) throws InterruptedException {
        Object lock = new Object();

        Runnable task = () -> {
            synchronized (lock) {
                System.out.println("Thread");
            }
        };

        Thread th = new Thread();
        th.start();
        synchronized (lock) {
            for (int i = 0; i <8 ; i++) {
                Thread.currentThread().sleep(1000);
                System.out.println(" " + i);

            }
            System.out.println("...");

        }
    }
}
