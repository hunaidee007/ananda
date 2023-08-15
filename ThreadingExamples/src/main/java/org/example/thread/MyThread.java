package org.example.thread;

public class MyThread extends Thread{

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
