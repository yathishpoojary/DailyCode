package JuneMonthFirst;

public class Scannner {
    public static void main(String[] args) {
            String st1 = "Hello";
            String st2= "Hello";

            String st3 = new String("Hello");

            System.out.println(st1==st2);
            System.out.println(st1== st3);
        System.out.println(st1.equals(st3));
        System.out.println(st2.intern());
    }
}
