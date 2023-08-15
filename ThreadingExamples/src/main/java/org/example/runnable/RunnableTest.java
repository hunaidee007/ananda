package org.example.runnable;

public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();
        MyRunnable myRunnable1 = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable1);

        thread.start();
        thread1.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName()+" i = " + i);
            Thread.sleep(1000);
        }
    }
}
