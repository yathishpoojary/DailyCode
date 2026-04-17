package Practice17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindHighestNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 8, 6);

        int FirstHighest =  nums.stream().sorted(
                Comparator.reverseOrder()
        ).distinct().findFirst().orElse(-1);

        System.out.println(" FindFirst "+ FirstHighest);

        System.out.println(" SecondHighest "+ nums.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(-1));
    }
}
