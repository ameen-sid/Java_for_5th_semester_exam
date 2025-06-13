package Tutorials;

class AA extends Thread {

    public AA(String name) {
        super(name);
    }

    @Override
    public void run() {

        System.out.println("Inside Thread A: ");
        // currentThread and getName
        System.out.println("Thread A ID: " + Thread.currentThread().getName());
        // getPriority
        System.out.println("Thread A Priority: " + Thread.currentThread().getPriority());
        // sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        for(int i = 1; i <= 5; i++) System.out.println("From thread A: i = " + i);
        System.out.println("End of thread A");
    }
}

class BB extends Thread {

    @Override
    public void run() {

        System.out.println("Inside Thread B: ");
        System.out.println("Thread B ID: " + Thread.currentThread().getName());
        System.out.println("Thread B Priority: " + Thread.currentThread().getPriority());
        for(int j = 1; j <= 5; j++) {

            System.out.println("From Thread B: j = " + j);
            // yield
            Thread.yield();
        }
        System.out.println("End of thread B");
    }
}

class CC extends  Thread {

    @Override
    public void run() {

        System.out.println("Inside Thread C: ");
        System.out.println("Thread C ID: " + Thread.currentThread().getName());
        System.out.println("Thread C Priority: " + Thread.currentThread().getPriority());
        for(int k = 1; k <= 5; k++) System.out.println("From thread C: k = " + k);
        System.out.println("End of thread C");
    }
}

public class ThreadMethods {

    public void mainFunction() throws InterruptedException {

        AA aa = new AA("AA");
        BB bb = new BB();
        CC cc = new CC();

        // setPriority
        cc.setPriority(Thread.MAX_PRIORITY);
        bb.setPriority(aa.getPriority() + 1);
        aa.setPriority(Thread.MIN_PRIORITY);

        // start
        System.out.println("Thread A Starting...");
        aa.start();

        System.out.println("Thread B Starting...");
        // setDaemon
        bb.setDaemon(true);
        bb.start();

        System.out.println("Thread C Starting...");
        cc.start();
        // interrupt
        cc.interrupt();

        // join
        aa.join();
    }
}
