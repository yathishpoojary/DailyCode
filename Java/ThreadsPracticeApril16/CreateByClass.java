package ThreadsPracticeApril16;

public class CreateByClass extends Thread{

    @Override
    public void run() {
        System.out.println(" My Current thread is running "+Thread.currentThread().getName());
    }
    public static void main(String []args){
        CreateByClass t1= new CreateByClass();
        CreateByClass t2= new CreateByClass();
        t1.start();
        t2.start();
    }
}
