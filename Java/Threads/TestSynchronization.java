package Threads;

class Counter {
    int count =0;

    void increment() {
        count++;
    }
}

public class TestSynchronization {
    public static void  main (String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t2.join();
        t1.join();

        System.out.println( "Count "+c.count);

    }
}
