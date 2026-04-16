package ThreadsPracticeApril16;

public class TreadState {
    public static void main(String []args) throws InterruptedException {
        Thread t1 = new Thread(
                ()->{
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
        );
        System.out.println(t1.getState());
        t1.start();
//        t1.wait(10000);
//        System.out.println(t1.);
        System.out.println(t1.getState());


    }
}
