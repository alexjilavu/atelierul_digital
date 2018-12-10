package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static long v = 0;
    public static void main(String[] args) throws InterruptedException {
	    int numberOfThreads = 5000;
        List<MyThread> threads = new ArrayList<>();

        // create threads
        for(int i = 0; i < numberOfThreads; i++){
	        threads.add(new MyThread());
        }

        //start threads
        for(MyThread thread: threads)
            thread.start();

        //wait for all threads to finish execution
        for(MyThread thread: threads)
            thread.join();
        System.out.println(v);

    }

    static class MyThread extends Thread{
        @Override
        public void run(){
            increment();
        }

        static synchronized void increment(){
            for(int i = 0; i < 1_000_000; i++) {
                v++;
            }
        }

    }
}
