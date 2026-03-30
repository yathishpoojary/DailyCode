package Threads;

class MyRunnable implements Runnable {
    private String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " → " + i);
        }
    }
}

public class ThreadFromRunnable {

    public static void main(String[] args) {

        Thread mt1 = new Thread(new MyRunnable("Thread 1:"));
        Thread mt2 = new Thread(new MyRunnable("Thread 2:"));

        mt1.start();
        mt2.start();

    }

}
