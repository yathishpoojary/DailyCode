package Threads;

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name =  name;
    }

    public void run (){
        for(int i = 0; i < 2; i++) {
            System.out.println(" Thread " + name+ " value "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadClass {

    public static void  main( String[] args) {
        MyThread m1 = new MyThread("Thread 1");
        MyThread m2 = new MyThread("Thread 2");

        m1.start();
        m2.start();

    }
}
