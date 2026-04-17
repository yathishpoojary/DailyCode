package ThreadsPracticeApril16;

public class Counter {
    static int count = 0 ;
    static void incrementCount( ){
        count++;
    }
    public static void main(String []args) {
        Counter.incrementCount();
        Counter.incrementCount();
        System.out.println(count);
    }
}
