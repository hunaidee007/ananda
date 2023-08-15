package org.example.thread;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        myThread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName()+" i = " + i);
            Thread.sleep(1000);
        }
    }
}
