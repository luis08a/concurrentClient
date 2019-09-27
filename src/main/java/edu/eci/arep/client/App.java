package edu.eci.arep.client;

import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
    private static final int threads = 1;

    public static void main(String[] args) {
        Thread[] tList = new Thread[threads];
        double begin = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            Thread t = new Thread(new MyThread());
            t.start();
            tList[i] = t;
        }

        for (Thread t : tList) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        double end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}
