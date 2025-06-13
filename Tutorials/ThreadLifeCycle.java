package Tutorials;

class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadLifeCycle {

    public void mainFunction() throws InterruptedException {

        MyThread t1 = new MyThread();   // NEW
        System.out.println(t1.getState());

        t1.start(); // RUNNABLE
        System.out.println(t1.getState());

        Thread.sleep(100);  // TIME_WAITING
        System.out.println(t1.getState());

        t1.join();
        System.out.println(t1.getState());  // TERMINATED
    }
}
