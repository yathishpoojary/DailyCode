package ThreadsPracticeApril16;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExcecutorService {
    public static void main(String []args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.submit(()-> {
            System.out.println(" TAks 1 ");
        });
        ex.submit(()-> {
            System.out.println(" TAks 21 ");
        });
    }
}
