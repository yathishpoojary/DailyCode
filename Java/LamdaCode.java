import java.util.Arrays;
import java.util.List;

public class LamdaCode {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Hello","bat", "call");
        lst.sort((a,b)->a.length()-b.length());
        System.out.println(lst);

        List<String> lst2 = Arrays.asList("Hello","bat","call");
        lst.sort((a,b)->a.length() + b.length());
        System.out.println(lst2);


    }
}
