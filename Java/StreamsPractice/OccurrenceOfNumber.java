package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1, 2);
        Map<Integer, Long> occurrences = numbers.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()      // 2️⃣ count each group
                ));

        Map<Integer,Long> map2= numbers.stream()
                .collect(Collectors.groupingBy(
                        n-> n,
                        Collectors.counting()
                ));
// Expected → {1=2, 2=3, 3=2, 4=1, 5=1}




    }
}
