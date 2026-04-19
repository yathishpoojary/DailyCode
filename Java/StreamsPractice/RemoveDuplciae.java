package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplciae {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1, 2);
// Expected → [1, 2, 3, 4, 5]

        List<Integer> numbers1=   numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(
                "Number " + numbers1
        );
    }
}
