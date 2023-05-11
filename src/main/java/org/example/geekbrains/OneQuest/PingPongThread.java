package org.example.geekbrains.OneQuest;

import java.util.concurrent.locks.ReentrantLock;

public class PingPongThread implements Runnable {

    static ReentrantLock counterLock = new ReentrantLock(true);

    static void print(){
        counterLock.lock();
        try{
            System.out.println(Thread.currentThread().getName());
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
            print();
        }
    }

    public static void main(String[] args) {
        PingPongThread te = new PingPongThread();
        Thread thread1 = new Thread(te);
        Thread thread2 = new Thread(te);

        thread1.setName("ping");
        thread2.setName("pong");

        thread1.start();
        thread2.start();
    }
}