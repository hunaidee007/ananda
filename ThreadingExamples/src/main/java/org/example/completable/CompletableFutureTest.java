package org.example.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            // call webservice
            // complex computation
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        CompletableFuture<Void> secondCompletableFuture = completableFuture.thenAccept(gotResult -> {
            System.out.println("This is another thread after first thread is complete");
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " ***** = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        secondCompletableFuture.thenAccept(gotResult -> {
            System.out.println("This is another thread after first thread1 is complete");
        });

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " $$$$$$$ = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Starting the thread");
        completableFuture.get();

        System.out.println("Got Results");

    }
}
