package Java8;

public class Lamda {
    public static void main(String[] args) {
       Thread tr = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println(" Hello Threads are running");
           }
       });

       Thread tr1 = new Thread(()-> System.out.println("2nd THread"));
tr.start();
tr1.start();
    }

}
