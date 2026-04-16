package ThreadsPracticeApril16;

public class RunnableInterfaceTread implements Runnable {

    @Override
    public void run() {
        System.out.println(" My running thread is 1 "+ Thread.currentThread().getName());
        System.out.println(" My running thread is 2 "+ Thread.currentThread().getState());
    }

    public static void main(String []args) {
        Thread t1 = new Thread(new RunnableInterfaceTread());
        Thread t2 = new Thread(new RunnableInterfaceTread());
        Thread t3 = new Thread(()-> {
            System.out.println(" Check "+ Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
