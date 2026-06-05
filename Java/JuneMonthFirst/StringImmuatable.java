package JuneMonthFirst;

public class StringImmuatable {
    public static void main(String[] args) {
        String st = "Hello";
        String  st1 =  st.concat("world");

        StringBuilder stB = new StringBuilder("Hello");
        stB.append("world");

        System.out.println(st1);
        System.out.println(stB);
    }
}
