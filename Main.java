import Tutorials.*;
import Questions.*;

class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread 1");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {

        System.out.println("Thread 2");
        for(int i = 1; i <= 10; i++) {
            if(i % 2 != 0) System.out.println(i);
        }
    }
}