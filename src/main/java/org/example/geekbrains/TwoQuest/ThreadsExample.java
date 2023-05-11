package org.example.geekbrains.TwoQuest;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadsExample implements Runnable {
    static int counter = 1;

    static ReentrantLock counterLock = new ReentrantLock(true);

    static void incrementCounter(){
        counterLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + ": " + counter);
            counter++;
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
            counterLock.unlock();
        }
    }

    @Override
    public void run() {
        while (true){
            incrementCounter();
        }
    }

    public static void main(String[] args) {
        ThreadsExample te = new ThreadsExample();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);

        thread1.start();
        thread2.start();
    }
}