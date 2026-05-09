package com.Week9.MultiThreading;

public class MultiThreading {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();

        NumberThread t2 = new NumberThread();
        t2.count();;

    }
}


class MyThread extends Thread {

    public void run() {

        System.out.println("Thread running");

    }

}

class NumberThread extends Thread {

    public void count() {

        for(int i=1; i<=5; i++) {

            System.out.println(i);

        }

    }

}

//Creating Thread Using Thread Class