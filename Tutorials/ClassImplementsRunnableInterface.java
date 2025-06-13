package Tutorials;

class World implements Runnable {

    @Override
    public void run() {

        for(;;) System.out.println(Thread.currentThread().getName());
    }
}

public class ClassImplementsRunnableInterface {

    public void mainFunction() {

        World world = new World();
        Thread t1 = new Thread(world);  // NEW
        t1.start(); // RUNNABLE

        for(;;) System.out.println(Thread.currentThread().getName());
    }
}
