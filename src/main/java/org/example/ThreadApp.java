package org.example;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            SomeThread someThread = new SomeThread();
            someThread.start();
            Thread.sleep(1000);
        }
    }
}

class SomeThread extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "  is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void destroy()  {
        System.out.println(Thread.currentThread().getName() + "  destructor");
    }
}