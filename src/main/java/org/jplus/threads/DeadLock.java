package org.jplus.threads;

public class DeadLock {

    private final Object objA = new Object();
    private final Object objB = new Object();

    public void execute() {
        print("--init thread locker A, B--");
        final Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    locker1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1");

        print("--init thread locker B, A--");
        final Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    locker2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread2");
        thread1.start();
        thread2.start();
    }

    private void locker1() throws InterruptedException {
        synchronized (objA) {
            print("Locker one locked A");
            Thread.sleep(500);
            print("Locker one is waiting for B");
            synchronized (objB) {
                print("Deadlock failed");
            }
        }
    }

    private void locker2() throws InterruptedException {
        synchronized (objB) {
            print("Locker two locked B");
            Thread.sleep(500);
            print("Locker two is waiting for A");
            synchronized (objA) {
                print("Deadlock failed");
            }
        }
    }

    private void print(String s) {
        System.out.println(s);
    }
}
