package org.example.callable;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable myCallable = new MyCallable();
        MyCallable myCallable1 = new MyCallable();
        MyCallable myCallable2 = new MyCallable();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future=executorService.submit(myCallable);
        Future<String> future1=executorService.submit(myCallable1);
        Future<String> future2=executorService.submit(myCallable2);


       /* System.out.println("Callable 1 " + future.get());
        System.out.println("Callable 2 " +future1.get());
        System.out.println("Callable 3 " +future2.get());*/


        for (int i = 1; i <= 10; i++) {

            System.out.println(Thread.currentThread().getName()+" i = " + i);
            Thread.sleep(1000);

        }


    }
}
