package Threads;

public class ThreadCreateFromLamda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
          System.out.println(" Hello");
        });

        Thread t2 = new Thread(()-> {
            System.out.println(" My name");
        });

        t1.start();
        t2.start();
    }
}
