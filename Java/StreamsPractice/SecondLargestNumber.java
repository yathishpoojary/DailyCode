package StreamsPractice;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 9, 3, 7, 5, 6, 4, 8, 2);
        int num = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(0).findFirst().orElse(-1);
        System.out.println("Num "+num);
// Expected → Second Largest: 8
    }
}
