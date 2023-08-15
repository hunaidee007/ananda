package org.example.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        return "done!";
    }
}
