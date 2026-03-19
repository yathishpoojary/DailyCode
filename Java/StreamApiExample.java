import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(number);
        List<Integer> result = number.stream().filter(n-> n%2 ==0).toList();
        List<Integer> result2 = number.stream().filter(n-> n%2 ==0).map(m->m*2).collect(Collectors.toList());
        ;

        System.out.println(result);
        System.out.println(result2);

    }
}
